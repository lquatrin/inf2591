package tree_search;
import x10.array.*;

public class Tour {
	private val listofnodes:Array_1[Int];
	
	public def this() {
		
	}
	
	public def AddNode(ind:Int){
		listofnodes(listofnodes.size) = ind;
	}
	
}