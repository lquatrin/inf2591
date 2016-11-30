/**
 * The canonical "Hello, World" demo class expressed in X10
 */
import tree_search.RDFS;

public class Hello {

    /**
     * The main method for the Hello class
     */
    public static def main(Rail[String]) {
        finish for (p in Place.places()) {
            at (p) async Console.OUT.println("Hello World Tree Search from place "+p.id);
        }

        val dfs : RDFS = new RDFS();
        Console.OUT.println("Magnitude "+dfs.magnitude());
    }

}