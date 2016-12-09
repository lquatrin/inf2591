package MExamples;

public class AsyncExample {
	static def task1() {
		Console.OUT.println("task1");
	}
	static def task2() {
		Console.OUT.println("task2");
	}
	static def task3() {
		Console.OUT.println("task3");
	}
	
	public static def taskNoReturn () {
		Console.OUT.println("No Return");
	}
	
	public static def taskReturn1 () : Double {
		Console.OUT.println("Return 1");
		return 1.0;
	}
		
	public static def taskReturn2 () {
		Console.OUT.println("No Return 2");
		return 2.0;
	}
		
	public static def main (Rail[String]) {
		taskNoReturn();
		var a : Double = taskReturn1();
		var b : Double = taskReturn2();
		Console.OUT.println(a + " " + b);
		
		
		/*async task1();
		task2 ();
		async task3();*/
	}
}