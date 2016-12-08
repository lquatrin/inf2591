package daveHudakX10Overview;

public class GlobalrRefObjectsInPlaces {
	public static def main(args:Rail[String]):void {
	
		val secondCtr = (at (Place(1)) GlobalRef[Counter](new Counter(5)));
		for (var i:Int = 0 as Int; i < 10; i++) {
			at (secondCtr.home) {
				secondCtr().Count();
			}
		}
		val secondValue = (at (secondCtr.home) secondCtr().GetCount());
		Console.OUT.println("Second value = "+secondValue);
	}

}