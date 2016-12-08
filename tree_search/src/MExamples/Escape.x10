package MExamples;

public class Escape {
	private var task: ()=>void = null;
	private var stop: Boolean = false;
	public def this() {
		async {
			while (!stop) {
				val t: () => void;
				when (task != null || stop) {
					t = task;
					task = null;
				}
				if (t != null) {
					async { t(); }
				}
			}
		}
	}
	public operator async (body: () => void) {
		when (task == null) {
			task = body;
		}
	}
	public def stop() {
		atomic { stop = true; }
	}

}