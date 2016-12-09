package MExamples;

public class CancelableWhen {
	private var stop : Boolean = false;
	public operator when(condition:Cell[Boolean], body:()=>void) {
		when (condition() || stop) {
			if (!stop) { body(); }
		}
	}
	public def cancel() {
		atomic { stop = true; }
	}

}