package daveHudakX10Overview;

import x10.lang.*;
import x10.util.Random;

public class AtomicExample {
	public static def main(args:Rail[String]) {
		var count : Double = 0;
		finish for(val i in (1..3)) async{
				atomic { count += 1.0; }
		}
		Console.OUT.println(count);
	}
}