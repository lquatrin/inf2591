/**
 * The canonical "Hello, World" demo class expressed in X10
 */
public class Main {

    /**
     * The main method for the Hello class
     */
    public static def main(args:Rail[String]):void {
        finish for (p in Place.places()) {
            at (p) async Console.OUT.println(args(0) + " from place "+ p.id);
        }
        Console.OUT.println("Goodbye");
    }

}