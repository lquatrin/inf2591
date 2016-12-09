package MExamples;

public class WhenExample1 {
	public static def main(Rail[String]) {
		val c = new CancelableWhen();
		val b = new Cell[Boolean](false);
		finish {
			async {
				c.when(b) { Console.OUT.println("KO"); }
			}
			c.cancel();
		}
	}
}