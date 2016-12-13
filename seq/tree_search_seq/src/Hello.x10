
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


public class Hello {
	
	private val size:Int;
	private val dist:Array_2[Int];
	
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
		Console.OUT.println("Hello World Tree Search ");
		var search:NRDFS = new NRDFS(size,dist);
		var str:String = "|\t";
		for(i in 0 .. (size-1)){
			//Console.OUT.println("Just print the table");
			for(j in 0..(size-1)){
				str+= dist(i,j) + "\t";
			}
			//Console.OUT.println(str + "|");
			str = "|\t";
		}
		for (i in 1 .. (size-1)){
			var mArray:ArrayList[Int] = new ArrayList[Int]();
			mArray.add(0 as Int);
			mArray.add(i as Int);
			var tour:Tour = new Tour(mArray,size);
			search.addTour(tour);
		}
		
		var start_time : Long = System.currentTimeMillis();
		Console.OUT.println("Start salesman problem");
		search.Solve();	
		var finish_time : Long = System.currentTimeMillis();
		Console.OUT.println("Finished in " + (finish_time - start_time) + " miliseconds");
	}
	
    public static def main(args:Rail[String]) {
        
    	val f = new File("uk12_dist.txt");
    	val fr = new FileReader(f);
    	var tsp:Hello = new Hello(fr);
    	tsp.solve();
        Console.OUT.println("Finished");
    }
}