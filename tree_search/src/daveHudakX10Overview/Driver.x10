package daveHudakX10Overview;

import daveHudakX10Overview.Counter;

class Driver {
	public static def main(args:Rail[String]):void {
		val firstCounter = new Counter();
		val secondCounter = new Counter(5 as Long);
		for (var i : Int = 0 as Int; i<10; i++) {
			firstCounter.Count();
			secondCounter.Count();
		}
		val firstValue = firstCounter.GetCount();
		val secondValue = secondCounter.GetCount();
		Console.OUT.println("First value = " + firstValue);
		Console.OUT.println("Second value = " + secondValue);
	}
}
