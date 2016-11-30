/*
 * https://snap.stanford.edu/data/
 * 
 * http://www5.in.tum.de/lehre/praktika/ftcp/04_advanced.pdf
 * http://jvde.us/forum/index.php?topic=6.0
 * http://x10-lang.org/documentation/x10dt-installation.html
 * http://forums.x10.com/index.php?topic=26297.0
 * http://x10.sourceforge.net/documentation/languagespec/x10-latest.pdf
 * https://www.cs.colostate.edu/wiki/mediawiki/images/5/5d/X10programmingguide.pdf
 * http://x10.sourceforge.net/documentation/intro/latest/html/
 * 
 * 
 * http://saraswat.org/graph.pdf
 * http://x10-lang.org/articles/154.html
 */

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
