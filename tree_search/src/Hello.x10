/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import tree_search.RDFS;

import x10.array.Array;
import x10.array.Array_2;
import x10.compiler.Foreach;

public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def main(Rail[String]) {
        finish for (p in Place.places()) {
            at (p) async Console.OUT.println("Hello World Tree Search from place "+p.id);
        }

        val ar2 : Array_2[Int] = new Array_2[Int](10,10);
        
        ar2(0,0) = (10 as Int);
        Console.OUT.println("Magnitude "+ ar2(0,0));
        
        
        val dfs : RDFS = new RDFS();
        Console.OUT.println("Magnitude "+dfs.magnitude());
    }

}