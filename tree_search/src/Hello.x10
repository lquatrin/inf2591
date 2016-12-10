import tree_search.RDFS;
import tree_search.NRDFS;
import tree_search.Tour;

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

import x10.lang.Reducible;

public class Hello {
	private val size:Int;
	private val dist:Array_2[Int];
	
	public def GetSize () : Int 
	{
		return size;
	}
	
	public def GetDist (i:Int, j:Int) : Long
	{
		return dist(i,j) as Long;
	}
	
	def this(r:Reader) throws Exception{
		size = nextInt(r);
		dist =  new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = nextInt(r);
		}
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
	
	def solve() : Array_1[Int]{
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
				var search:NRDFS = new NRDFS(size,dist);
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
					val myTourFinalRes = search.GetBestTourListOfNodes();
					val myFinalResult = search.GetBestCost();
					
					//Console.OUT.println(here.id + " " + myFinalResult);
					
					//Calls an atomic block at GlobalRef's home place to check if
					// we found a new best Tour
					at(result.home){
						val v : Long = myFinalResult;
						val ar : ArrayList[Int] = myTourFinalRes;
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
		}
		//Return the best tour
		var ret_tour : Array_1[Int] = new Array_1[Int](besttour());
		return ret_tour;
	}
	
    public static def main(args:Rail[String]) {
    	val f = new File("./sp11_dist.txt");
    	val fr = new FileReader(f);
    	var tsp:Hello = new Hello(fr);
    	
    	var start_time : Long = System.currentTimeMillis();
    	Console.OUT.println("Start salesman problem");
    	
    	//Solve TSP problem and receive the best tour	
     	var result : Array_1[Int] = new Array_1[Int](tsp.solve());
      	
     	var finish_time : Long = System.currentTimeMillis();
        Console.OUT.println("Finished in " + (finish_time - start_time) + " miliseconds");
        
        //Compute the best tour with the best cost
        var best_tour_cost : Long = 0 as Long;
        for (i in 0..(tsp.GetSize() - 2))
        { 
        	best_tour_cost += tsp.GetDist(result(i), result(i+1)) as Long;
        }
        best_tour_cost += tsp.GetDist(result((tsp.GetSize() - 1) as Int) as Int, 0 as Int) as Long;
        
        //Print Best Tour and Best Cost
        Console.OUT.print("Best Tour: ["); 
        for (i in 0..(tsp.GetSize() - 1))
        { 
        	Console.OUT.print(result(i) + ", ");
        }
        Console.OUT.print("0]\n");
        Console.OUT.println("Best Cost: " + best_tour_cost); 
    }
    
    //Solution with GlobalRef And Atomic
    // -> numPlaces() must to be equal size - 1
    def solveWithGlobalRefAndAtomic ()
    {
    	val besttour = new GlobalRef[Array_1[Int]](new Array_1[Int](size));
    	val result = new GlobalRef[Cell[Long]](new Cell[Long](Long.MAX_VALUE));
    	finish for (p in Place.places()) {
    		at (p) async {
    			var search:NRDFS = new NRDFS(size,dist);
    			var mArray:ArrayList[Int] = new ArrayList[Int]();
    			mArray.add(0 as Int);
    			mArray.add((p.id+1) as Int);
    			var tour:Tour = new Tour(mArray,size);
    			search.addTour(tour);
    			search.Solve();
    			
    			//Pega o melhor Tour de cada place
    			val myTourFinalRes = search.GetBestTourListOfNodes();
    			val myFinalResult = search.GetBestCost();
    			//Chama uma funcao no place 0 e tenta setar a nova melhor rota
    			at(result.home){
    				val v = myFinalResult;
    				atomic{
    					if (v < result()()) {
    						//Valor
    						result().set(v);
    						//Rota
    						for(i in 0 .. (size-1)){
    							besttour()(i) = myTourFinalRes(i);					
    						}
    					}
    				}	
    			}
    		}	
    	}
    	//Imprimir a menor rota
    	Console.OUT.println("Best Cost: " + result()());
    	Console.OUT.println("Best Tour: " + besttour());
    }
    
    //Solution with MinReducer
    // -> numPlaces() must to be equal size - 1
    def solveWithReducer()
    {
    	val result = finish(Reducible.MinReducer[Long](Long.MAX_VALUE)) {
    	for (p in Place.places()) {
    		at (p) async {
    	 	//Console.OUT.println("Hello World Tree Search from place "+p.id);
    		var search:NRDFS = new NRDFS(size,dist);
    	 	var str:String = "|\t";
    	 	//Console.OUT.println("Just print the table");
    	 	for(i in 0 .. (size-1)){
    	 		for(j in 0..(size-1)){
    	 			str+= dist(i,j) + "\t";
    	 		}
    	 		//Console.OUT.println(str + "|");
    	 		str = "|\t";
    	 	}
    	 	var mArray:ArrayList[Int] = new ArrayList[Int]();
    	 	mArray.add(0 as Int);
    	 	mArray.add((p.id+1) as Int);
    	 	var tour:Tour = new Tour(mArray,size);
    	 	search.addTour(tour);
    	 	search.Solve();
    	 	
    	 	offer search.GetBestCost();
   			}	
   		}
   		};
    }
}