package tree_search;


import x10.array.*;
import x10.util.*;

public class Tour {
	private val listofnodes:ArrayList[Int];
	private var listofvisited:Array_1[Int];
	private var size:Int;
	public var curr_cost : Long;
	
	
	
	public def this(nodes:ArrayList[Int],valor:Int) {
			this.listofnodes = nodes;
			this.size = valor;
			this.listofvisited = new Array_1[Int](size as Long);
			for (i in 0..(size-1)){ 
				this.listofvisited(i) = -1 as Int;
			}
			this.listofvisited(0 as Int) = 1 as Int;
			this.listofvisited(listofnodes(1) as Int)= 1 as Int;
			this.curr_cost = 0 as Long;
	}
		
		public def AddNode(ind:Int){
			listofnodes.add(ind);
			//PrintTour();
		}
		
		public def GetSize():Long{
			return listofnodes.size();
		}
		
		public def RemoveNode(){
			listofnodes.removeLast();
		}
		
		public def GetList():ArrayList[Int]{
			return listofnodes;
		}
		
		public def SetNodeVisited(i:Int){
			listofvisited(i)= 1 as Int;
		}
		
		public def GetNodeVisited(i:Int):Int{
			return listofvisited(i) as Int;
		}
		
		public def SetCurrCost (v : Long)
		{
			this.curr_cost += v;
		}
		
		public def GetCurrCost () : Long
		{
			return this.curr_cost;
		}
		
		public def PrintTour(){
			var str:String = "";
			for(i in 0 .. (listofnodes.size()-1)){
				str+= listofnodes(i)+"\t";
			}
			Console.OUT.println(str);
		}
		
		public static def main(Rail[String]) {
			
		}
	}
