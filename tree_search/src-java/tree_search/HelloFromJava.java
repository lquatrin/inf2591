package tree_search;

import tree_search.RDFS;

//import x10.x10rt.X10RT;

public class HelloFromJava {

	public static void main(String[] args) {
		System.out.println("Hello From Java");
		
		RDFS r = new RDFS();
		
		System.out.println("x: " + r.x + ", y:" + r.y);
		System.out.println("Magnitude: " + r.magnitude$O());
		
		r.prints();
	}

}
