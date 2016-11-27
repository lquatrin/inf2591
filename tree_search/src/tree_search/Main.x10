package tree_search;

public class Main{

	public static def main(args:Rail[String]):void {
		finish for (p in Place.places()) {
			at (p) async Console.OUT.println(args(0) + " from place "+ p.id);
		}
		Console.OUT.println("Goodbye");
	}

}