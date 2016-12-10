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

	//Leitura dos dados
	
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
	
	def solve(){
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
				
				val myTourFinalRes = search.GetBestTourListOfNodes();
				val myFinalResult = search.GetBestCost();
				at(result.home){
					val v = myFinalResult;
					atomic{
						if (v < result()())
						{
							result().set(v);
						
							for(i in 0 .. (size-1)){
								besttour()(i) = myTourFinalRes(i);					
							}
						}	
					}	
				}
			}	
		}
		Console.OUT.println("Best Cost: " + result()());
		Console.OUT.println("Best Tour: " + besttour());
	}
	
    public static def main(args:Rail[String]) {
        
    	val f = new File("./map4.txt");
    	val fr = new FileReader(f);
    	var tsp:Hello = new Hello(fr);
    	tsp.solve();
      
       // Console.OUT.println("Finished");
    }
    
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