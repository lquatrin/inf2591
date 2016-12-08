package daveHudakX10Overview;

import x10.lang.*;

public class AtomicExample {

	public static val count = 0;
	
	public static def main(Rail[String]) {
		
		for(val i in (1..3)){
			async{
				count++;
				// = count + (1 as Int);	
				//atomic count++;
			}
		}
	}
}