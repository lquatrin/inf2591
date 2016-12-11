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
	
	public def SetGlobalRef (gref : GlobalRef[Solver])
	{
		my_global_ref = gref;
		Console.OUT.println("GlobalRef Home: " + my_global_ref.home);
	}
	
	public def this (sz : Int, distances : Array_2[Int])
	{
		size = sz;
		dist =  new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = distances(i,j);
		}
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
	
	def SolveSalesmanProblem() : Array_1[Int]{
		//Create GlobalRefs to all places
		val besttour = new GlobalRef[Array_1[Int]](new Array_1[Int](size));
		val result = new GlobalRef[Cell[Long]](new Cell[Long](Long.MAX_VALUE));
		
		//Create an Array 1D with some data to distribute 
		//           equally between the available places
		//e.g. -> DistArray(9) to 3 places:
		//Place 0: [0..2] <- localIndices
		//Place 1: [3..5] <- localIndices
		//Place 0: [6..8] <- localIndices
		val tour_blocks = new DistArray_Block_1[Long](size - 1, (i:Long)=>(i + 1) as Long);

		finish for (p in Place.places()) {
			at (p) async {
				var search:NRDFS = new NRDFS(size, dist, my_global_ref);
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
					search.Solve();
					
					//Get the best Tour after NRDFS
					if (search.GetBestCost() < myFinalResult)
					{
						myTourFinalRes = search.GetBestTourListOfNodes();
						myFinalResult = search.GetBestCost();
					}
					Console.OUT.println(here.id + " " + myFinalResult);	
				}	
				
				//Calls an atomic block at GlobalRef's home place to check if
				// we found a new best Tour
				val amfr : Long = myFinalResult;
				val amtfr : ArrayList[Int] = myTourFinalRes;
				at(result.home){
					val v : Long = amfr;
					val ar : ArrayList[Int] = amtfr;
					atomic{
						if (v < result()()) {
							//Best Tour Cost
							result().set(v);
							//Best Tour
							for(i in 0 .. (size-1)){
								besttour()(i) = ar(i);					
							}
						}
					}	
				}
			}				
		}
		
		//Return the best tour
		var ret_tour : Array_1[Int] = new Array_1[Int](besttour());
		return ret_tour;
	}
	
}