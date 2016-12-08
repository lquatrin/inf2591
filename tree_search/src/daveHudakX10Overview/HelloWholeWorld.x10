package daveHudakX10Overview;

import x10.array.Array;
import x10.array.Array_2;
import x10.compiler.Foreach;
import x10.io.File;
import x10.io.Console;
import x10.io.IOException;
import x10.compiler.*;
import x10.io.FileReader;
import x10.io.Reader;
import x10.util.StringBuilder;

class HelloWholeWorld {  
	public static def main(args:Rail[String]):void {
		for (var i:Int = 0 as Int; i < Place.numPlaces(); i++) {
			val iVal = i;
			
			async at (Place(iVal)) {
				Console.OUT.println("Hello Whole World from place "+here.id);
			}
		}
	}
}
