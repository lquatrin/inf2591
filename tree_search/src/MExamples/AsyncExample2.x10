package MExamples;

import x10.array.*;

public class AsyncExample2 {
	public static def main(Rail[String]) {
		
	val array = new Array_1[Int](10);
	// increment all values sequential
	for (val i in array){
		array(i)++;
	}
	
	// increment all values parallel
	for (val i in array )
		async {
			array(i)++;
		}
	}
}