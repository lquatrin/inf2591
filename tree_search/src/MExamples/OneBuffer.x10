package MExamples;

public class OneBuffer {
	var datum:Int = 0 as Int;
	var filled:Boolean = false;
	
	def send(v:Int) {
		when ( !filled ) {
			datum = v;
			filled = true;
		}
	}
	
	def receive():Int {
		when ( filled ) {
			val v = datum;
			datum = 0 as Int;
			filled = false;
			return v;
		}
	}
	
	public static def main (args:Rail[String])
	{
		for(i:Long in 1..10) {
		}
	}
}