/**
 * The canonical "Hello, World" demo class expressed in X10
 * 
 * http://www.kadix.ca/x10/doc/concepts/annotation-1.html
 * http://www.kadix.ca/x10/doc/concepts/languageinteroperability-1.html
 * http://www.kadix.ca/x10/doc/concepts/managedx10-1.html
 * 
 * Useful links:
 * http://stackoverflow.com/questions/9659322/translating-java-to-x10
 * http://stackoverflow.com/questions/31470641/import-java-library-to-a-x10-class
 * http://stackoverflow.com/questions/11002010/x10-parallel-processing-shared-variable
 * http://stackoverflow.com/questions/22643004/what-is-the-difference-of-async-before-or-after-for-in-x10
 * http://stackoverflow.com/questions/22709063/how-do-i-generate-and-print-fibonacci-numbers-in-x10
 * 
 * http://stackoverflow.com/questions/15011158/x10-segmentation-fault-with-multi-places
 * 
 * https://www.cs.colostate.edu/wiki/mediawiki/images/5/5d/X10programmingguide.pdf
 * 
 * http://x10.sourceforge.net/tutorials/x10-2.4/Hartree-July-2013/x10-hartree-slides-july2013.pdf
 * http://x10.sourceforge.net/documentation/intro/intro-223.pdf
 * https://www.cs.colostate.edu/wiki/mediawiki/images/5/5d/X10programmingguide.pdf
 * 
 */
import tree_search.RDFS;

import x10.array.Array;
import x10.array.Array_2;
import x10.compiler.Foreach;
import x10.io.File;
import x10.io.Console;
import x10.io.IOException;
import x10.compiler.*;
import x10.io.FileReader;
import x10.io.Reader;
import x10.util.StringBuilder;

public class Hello {
	
	private val size:Int;
	private val dist:Array_2[Int];
		
	// Use native code in all backends:
	//@Native("c++","printf(\"Hello World!\\n\")")
	@Native("java","System.out.println(\"Hello World!\")")
	private static native def test1 () : void;

	// Only use native code in C++ backend:
	//@Native("c++","printf(\"Hello World!\\n\")")
	private static def test2 ():void {
		// X10 generated code used for Java backend
		val x : Int;
		x = 2 as Int;
	    //{ @Native("c++","printf(\"Hello World! %d\\n\", x);") {} }
		{ @Native("java","System.out.println(\"This is the number \"+(x));" ){}}
	}

	// Use function parameters in native code
	// #0 is the name of the class (Test in this case)
	// #1, #2, #3, etc. numbered parameters
	// #x, #fd etc. named parameters
	//@Native("c++","printf(\"This is the number %d\\n\", (#1))")
	@Native("java","System.out.println(\"This is the number \"+(#x))")
	private static native def test3 (x:Int) : void;
	
    /**
     * The main method for the Hello class
     */
	
	
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
	
	
	
    public static def main(args:Rail[String]) {
        
    	val f = new File("./map20.txt");
    	val fr = new FileReader(f);
    	
    	finish for (p in Place.places()) {
            at (p) async Console.OUT.println("Hello World Tree Search from place "+p.id);
        }

        val ar2 : Array_2[Int] = new Array_2[Int](10,10);
     
        ar2(0,0) = (10 as Int);
        val p : Point;
        p = [1, 2] as Point;
        Console.OUT.println("Magnitude "+ ar2(0,0));
        
        
        val dfs : RDFS = new RDFS();
        Console.OUT.println("Magnitude "+dfs.magnitude());
        
        dfs.prints();
        
        test1();
        test2();
        test3(13 as Int);
        
        try {
	        //http://x10.sourceforge.net/x10doc/2.4.1/x10/io/File.html
	        val input = new File("D:/GitHub/inf2591/input.txt");
	        
	        val inp = input.openRead();
	        for (line in inp.lines())
	        {
	        	Console.OUT.println(line);
	        }
        } catch (IOException) { }
        
      
        Console.OUT.println("Finished");
    }

}