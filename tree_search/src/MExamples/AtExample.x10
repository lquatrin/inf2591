package MExamples;

public class AtExample {
	static def task1 (p:Long) {
		Console.OUT.println("task1 " + p);
	}
	static def task2 (p:Long) {
		Console.OUT.println("task2 " + p);
	}
	static def task3 (p:Long) {
		Console.OUT.println("task3 " + p);
	}
	public static def main(Rail[String]) {
		var pg : PlaceGroup = here.places();
		//Part1: Traverse manually
		at (pg.next(here)) {
			var bpg : PlaceGroup = here.places();
			at(bpg.next(here)) {
				task1(here.id());
			}
		}
		
		//Part2: Traverse by the Iterator
		for (val p in Place.places()) at(p) {
			task2(p.id as Long);
		}
		
		//Part3: Compute asynchronous on every Place
		finish for(val p in Place.places()) async at(p) {
			task3(p.id);
		}
	}
}