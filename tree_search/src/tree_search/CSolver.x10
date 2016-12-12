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

public class CSolver {
	private val size : Int;
	private val dist:Array_2[Int];
	
	public static val stack_tours = PlaceLocalHandle.make[Stack[Tour]](Place.places(), ()=>new Stack[Tour]());
	
	public static val best_cost = PlaceLocalHandle.make[Cell[Long]](Place.places(), ()=>new Cell[Long](Long.MAX_VALUE));
	public static val best_tour = PlaceLocalHandle.make[Tour](Place.places(), ()=>new Tour(1 as Int));
	
    public def this (sz : Int, distances : Array_2[Int])
	{
		this.size = sz;
		this.dist =  new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = distances(i,j);
		}
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
		for (i in 0..(size - 2) as Int)
		{ 
			best_tour_cost += dist(result(i), result(i+1)) as Long;
		}
		best_tour_cost += dist(result((size - 1) as Int) as Int, 0 as Int) as Long;
		
		//Print Best Tour and Best Cost
		Console.OUT.print("Best Tour: ["); 
		for (i in 0..(size - 1))
		{ 
			Console.OUT.print(result(i) + ", ");
		}
		Console.OUT.print("0]\n");
		Console.OUT.println("Best Cost: " + best_tour_cost); 
	}
	
	public static def Feasible(t_tour:Tour,i:Int) : Boolean
	{
		var resp:Boolean = false;
		if (t_tour.GetNodeVisited(i) == 1 as Int)
			return false;
		return true;	
	}

	def SolveSalesmanProblem() : Array_1[Int]
	{
		val tour_blocks = new DistArray_Block_1[Long](size - 1, (i:Long)=>(i + 1) as Long);
		
		val best_global_tour = new GlobalRef[Array_1[Int]](new Array_1[Int](size));
		val best_global_cost = new GlobalRef[Cell[Long]](new Cell[Long](Long.MAX_VALUE));
		
		for(p in Place.places())
		{
			at(p)
			{
				stack_tours().clear();
				best_cost()(Long.MAX_VALUE);
			}
		}
		
		finish for (p in Place.places()) {
			at (p) async {
								
                //Each localIndice
				for(id in tour_blocks.localIndices()) 
				{
					var mArray:ArrayList[Int] = new ArrayList[Int]();
					mArray.add(0 as Int);
					mArray.add((tour_blocks(id)) as Int);
					
					var tour:Tour = new Tour(mArray,size);
					tour.SetCurrCost(dist(0, (tour_blocks(id)) as Int));
					
					stack_tours().push(tour);
				}
				
				// WHile terminate{
				//VERIFICAR SE O PROCESSO EST� ATIVO
				
				var local_best_cost : Long = best_cost()();
				while(!stack_tours().isEmpty())
				{
					//atomic {pega quantidade de caras que est�o esperando}
					//VERIFICAR SE TEM PLACES ESPERANDO NOVOS ELEMENTOS
					
					
					var curr_tour : Tour = stack_tours().pop();
					
					val tour_cost : Long = curr_tour.GetCurrCost();
					
					//Verifica custo e atualiza
					var good_tour : Boolean = false;					
					if (tour_cost < local_best_cost)
					{
						atomic{ local_best_cost = best_cost()(); }
						good_tour = tour_cost < local_best_cost;
					}
									
					if (good_tour)
					{
						//Rota Completa
						if (curr_tour.GetSize() == size as Long)
						{
							var value : Long = curr_tour.GetCurrCost();
							
							val List : ArrayList[Int] = curr_tour.GetList();
							var id : Int = List((List.size() - 1)) as Int;
							value += (dist(id, 0) as Long);
							
							if (value < local_best_cost)
							{
								best_cost().set(value);
								best_tour().Copy(curr_tour);
														
								val up_g_local_best_cost = best_cost()();
								at(best_global_cost.home)
								{
									var update_if_necessary : Boolean = false;
									atomic {
										if (up_g_local_best_cost < best_global_cost()())
										{
											best_global_cost()() = up_g_local_best_cost;
											for(t in 0..(List.size()-1) as Int)
											{
												best_global_tour()(t) = List(t);
											}
											update_if_necessary = true;
										}
									}
									if (update_if_necessary)
									{
										for(psg in Place.places())
										{
											at(psg) 
											{
												atomic { best_cost()() = up_g_local_best_cost; }
											}	
										}
									}
								}
							}
						}
						//Rota Parcial
						else{
							for (var i:Int = (size-1) as Int; i > 0 as Int; i= i - 1 as Int){
								if (Feasible(curr_tour, i as Int))
								{		
									curr_tour.AddNode(i);
									curr_tour.SetNodeVisited(i);
																																			
									var s_2 : Int = curr_tour.GetCityNode((curr_tour.GetSize() - 2) as Int);

									var m_array:ArrayList[Int] = curr_tour.GetList().clone();

									var newtour:Tour = new Tour(m_array,size);
									newtour.SetCurrCost(
											curr_tour.GetCurrCost() + 
											dist(s_2, i)
									);
									
									stack_tours().push(newtour);
									
									curr_tour.SetNodeUnvisited(i);
									curr_tour.RemoveNode();
								}
							}
						}
					}

				}
				
				//DIZER QUE EST� ESPERANDO NOVOS PROCESSOS
				//para cada place atomic {Aumenta a quantidade de caras vazios}
				
				// WHile terminate}
				
			}
		}
				
		//Return the best tour
		var ret_tour : Array_1[Int] = new Array_1[Int](best_global_tour());
		return ret_tour;
	}
		
	private static def nextInt(r:Reader){
		val sb = new StringBuilder();
		var skip_white:Boolean = true;
		while(r.available()!=0){
			val c = r.read() as Char;
			if (skip_white && c.isWhitespace())
				continue;
			if (c.isDigit())  {
				sb.add(c);
				skip_white = false;
			} else
				break;
		}
		
		return Int.parse(sb.toString());
	}
	
	public static def main(args:Rail[String]) {
		val f = new File("./uk12_dist.txt");
		val fr = new FileReader(f);
		                            
		var size : Int = nextInt(fr);
		
		var dist : Array_2[Int] = new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = nextInt(fr);
		}
		
		val msolver = new CSolver(size, dist);
		
		msolver.Run();
	}
}