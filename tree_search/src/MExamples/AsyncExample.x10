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
	
	public static def main (Rail[String]) {
		async task1();
		task2 ();
		async task3();
	}
}