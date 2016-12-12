package tree_search;

import x10.array.*;
import x10.array.Array_1;
import x10.array.Array_2;
import x10.compiler.Foreach;
import x10.io.File;
import x10.io.Console;
import x10.io.IOException;
import x10.compiler.*;
import x10.io.FileReader;
import x10.io.Reader;
import x10.util.StringBuilder;
import x10.util.*;

public class Solver {
	private val size:Int;
	
	private val dist:Array_2[Int];
	
	private var my_global_ref : GlobalRef[Solver];
	
	public val result = new GlobalRef[Cell[Long]](new Cell[Long](Long.MAX_VALUE));
	
	static val places = Place.places();
	public static val best_result = PlaceLocalHandle.make[Cell[Long]](places, ()=>new Cell[Long](-1));
	
	public static val places_waiting = PlaceLocalHandle.make[Cell[Long]](places, ()=>new Cell[Long](0));
	public static val loop_status = PlaceLocalHandle.make[Cell[Boolean]](places, ()=>new Cell[Boolean](true));
	
	//public static val tour_stealed = PlaceLocalHandle.make[Cell[Tour]](places, ()=>new Cell[Tour]());
	private val ListofWorkers:ArrayList[NRDFS];
	
	
	public def SetGlobalRef (gref : GlobalRef[Solver])
	{
		my_global_ref = gref;
		//Console.OUT.println("GlobalRef Home: " + my_global_ref.home);
	}
	
	public def this (sz : Int, distances : Array_2[Int])
	{
		size = sz;
		dist =  new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = distances(i,j);
		}
		ListofWorkers = new ArrayList[NRDFS]();
	}
	
	public def GetSize () : Int 
	{
		return size;
	}
	
	public def GetDist (i:Int, j:Int) : Long
	{
		return dist(i,j) as Long;
	}
	
	public def Run ()
	{
		var start_time : Long = System.currentTimeMillis();
		Console.OUT.println("Start salesman problem");
		
		//Solve TSP problem and receive the best tour	
		var result : Array_1[Int] = new Array_1[Int](SolveSalesmanProblem());
		
		var finish_time : Long = System.currentTimeMillis();
		Console.OUT.println("Finished in " + (finish_time - start_time) + " miliseconds");
		
		//Compute the best tour with the best cost
		var best_tour_cost : Long = 0 as Long;
		for (i in 0..(GetSize() - 2))
		{ 
			best_tour_cost += GetDist(result(i), result(i+1)) as Long;
		}
		best_tour_cost += GetDist(result((GetSize() - 1) as Int) as Int, 0 as Int) as Long;
		
		//Print Best Tour and Best Cost
		Console.OUT.print("Best Tour: ["); 
		for (i in 0..(GetSize() - 1))
		{ 
			Console.OUT.print(result(i) + ", ");
		}
		Console.OUT.print("0]\n");
		Console.OUT.println("Best Cost: " + best_tour_cost); 
	}
	
	
	public def updateStack(index:Int){
		at (result.home){
		  var itens : Int = -1 as Int ;
		   for(pt in places)
			{	
			   atomic{
			   	itens = ListofWorkers(pt.id).haveWork();
			   }
			   if (itens != -1 as Int){ 
				  ListofWorkers(index).finished(false);
				  return;
			  }
			}
		   ListofWorkers(index).finished(true);
		}
	}

	public def getTour(index:Int){
		at (result.home){
			/*var itens : Int = -1 as Int ;
			for(pt in places)
			{	
				itens = ListofWorkers(pt.id).haveWork();
			}
			if (itens!=-1 as Int){
				atomic{
				  ListofWorkers(itens).
				}
			}*/
		}
	}
	
	def SolveSalesmanProblem() : Array_1[Int]{
		//Create GlobalRefs to all places
		val besttour = new GlobalRef[Array_1[Int]](new Array_1[Int](size));
		//val result = new GlobalRef[Cell[Long]](new Cell[Long](Long.MAX_VALUE));
		
		//Create an Array 1D with some data to distribute 
		//           equally between the available places
		//e.g. -> DistArray(9) to 3 places:
		//Place 0: [0..2] <- localIndices
		//Place 1: [3..5] <- localIndices
		//Place 0: [6..8] <- localIndices
		val tour_blocks = new DistArray_Block_1[Long](size - 1, (i:Long)=>(i + 1) as Long);

		for(p in places) at(p) {
			best_result()(Long.MAX_VALUE);
		}
		for(p in places) at(p) {
			places_waiting()(0);
			loop_status()(true);
		}	
		for(p in places){
		  var tsearch:NRDFS = new NRDFS(size, dist,p.id as Int, my_global_ref);
		  ListofWorkers.add(tsearch);
		}

		finish for (p in Place.places()) {
			at (p) async {
				var search:NRDFS = ListofWorkers(p.id); //new NRDFS(size, dist,p.id as Int, my_global_ref);
				var myFinalResult : Long = Long.MAX_VALUE;
				var myTourFinalRes : ArrayList[Int] = new ArrayList[Int](size);
				
				//Each localIndice
				for(id in tour_blocks.localIndices()) 
				{
					var mArray:ArrayList[Int] = new ArrayList[Int]();
					mArray.add(0 as Int);
					mArray.add((tour_blocks(id)) as Int);
					
					var tour:Tour = new Tour(mArray,size);
					tour.SetCurrCost(dist(0, (tour_blocks(id)) as Int));
					
					search.addTour(tour);
				}
								
				var local_loop_status : Boolean = true;
				while(local_loop_status)
				{
					search.Solve();
					
					/*
					val waiting_places : Long;
					atomic { waiting_places = Solver.places_waiting()(); }
					if (search.RemainingTours() >= 2 && waiting_places > 0)
					{
					}
					*/

					//Get the best Tour after NRDFS
					if (search.GetBestCost() < myFinalResult)
					{
						myTourFinalRes = search.GetBestTourListOfNodes();
						myFinalResult = search.GetBestCost();
						
						//Console.OUT.println(here.id + " " + myFinalResult);	
						
						//Calls an atomic block at GlobalRef's home place to check if
						// we found a new best Tour
						val amfr : Long = myFinalResult;
						val amtfr : ArrayList[Int] = myTourFinalRes;
						at(result.home){
							val v : Long = amfr;
							val ar : ArrayList[Int] = amtfr;
							val f_x10_ibm_f : Long;
							val need_to_update : Boolean;
							atomic{
								if (v < result()()) {
									//Best Tour Cost
									result().set(v);
									f_x10_ibm_f = v;
									//Best Tour
									for(i in 0 .. (size-1)){
										besttour()(i) = ar(i);					
									}
									need_to_update = true;
								}
								else
								{
									f_x10_ibm_f = Long.MAX_VALUE;
									need_to_update = false;
								}
							}	
							if (need_to_update)
							{
								for(pt in places)
								{	
									at(pt) //async
									{
										atomic{ best_result().set(f_x10_ibm_f); }
									}		
								}
							}
						}	
					}
					
					if (search.RemainingTours() == 0)
					{
						local_loop_status = false;
						atomic{ loop_status()() = false; }
					
						for(pt in places)
						{	
							at(pt) //async
							{
								atomic{ places_waiting()() += 1; }
							}		
						}
									
						val finisht : Boolean;
						atomic {
							finisht = places_waiting()() == Place.numPlaces();
						}
						
						if(finisht)
						{
							for(pt in places)
							{	
								at(pt) //async
								{
									atomic{ loop_status()() = true; }
								}		
							}
						}
															
						while(!loop_status()());	
						local_loop_status = search.RemainingTours() > 0;
					}
					
				}	
			}				
		}
		
		//Return the best tour
		var ret_tour : Array_1[Int] = new Array_1[Int](besttour());
		return ret_tour;
	}
	
}