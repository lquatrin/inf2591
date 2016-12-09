package MExamples;

public class MSemaphore {
	private var taken : Boolean;
	
	def p() { 
		when (!taken)
		taken = true;
	}
	
	atomic def v() {
		this.taken = false;
	}
}