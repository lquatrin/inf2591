package MExamples;

public class FinishExample {
	static def task1() {
		Console.OUT.println("task1");
	}
	static def task2() {
		Console.OUT.println("task2");
	}
	static def task3() {
		
		Console.OUT.println("task3");
	}
	
	public def taskNoReturn ()
	{
		Console.OUT.println("Ma Task");
	}
	
	public def taskReturn ()
	{
		return 0;
	}
	
	//public def taskNoReturn ()
	//{
	//	Console.OUT.println("Ma Task");
	//}
	
	
	public static def main(Rail[String]) {
		finish{
			async task1();
			async task2();
		}
		finish async task3();
	}
}