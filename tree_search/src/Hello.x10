import tree_search.RDFS;
import tree_search.NRDFS;
import tree_search.NRDFSS;
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

import tree_search.Solver;

public class Hello {
	private var msolver : GlobalRef[Solver];
		
	def this(r:Reader) throws Exception
	{
		var size : Int = nextInt(r);
		
		var dist : Array_2[Int] = new Array_2[Int](size,size);
		for (i in 0..(size-1)){ 
			for ( j in 0..(size-1)) 
				dist(i,j) = nextInt(r);
		}
		
		msolver = new GlobalRef[Solver](new Solver(size, dist));
	}
	
	public def CallSolver ()
	{
		msolver().Run();
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
    	var tsp:Hello = new Hello(fr);
    	
    	tsp.CallSolver();
    }
    
    //Solution with GlobalRef And Atomic
    // -> numPlaces() must to be equal size - 1
    /*def solveWithGlobalRefAndAtomic ()
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
    }*/
    
    //Solution with MinReducer
    // -> numPlaces() must to be equal size - 1
    /*def solveWithReducer()
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
    }*/
}