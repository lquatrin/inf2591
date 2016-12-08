package MExamples;

public class Parallel {
	public static operator for[T](c: Iterable[T], body: (T)=>void) {
		finish {
			for(x in c) {
				async { body(x); }
			}
		}
	}
	public static def main(Rail[String]) {
		val cpt = new Cell[Long](0);
		Parallel.for(i:Long in 1..10) {
			atomic { cpt() = cpt() + i; }
		}
		Console.OUT.println(cpt());
	}
}