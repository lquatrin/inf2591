package MExamples;

import MExamples.Escape;

public class MainEscape {
	public static def main(Rail[String]) {
		val toplevel = new Escape();
		finish {
			toplevel.async { when (false){} }
		}
		Console.OUT.println("OK");
	}
}