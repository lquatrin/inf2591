package tree_search;
import x10.util.Stack;
import x10.array.*;
import x10.lang.Int;
import tree_search.RDFS;
import x10.util.*;
/*
 * for (city = n!1; city >= 1; city!!)
 *   Push(stack, city);
 * while (!Empty(stack)) {
 *   city = Pop(stack);
 *   if (city == NO CITY) // End of child list, back up
 *     Remove last city(curr tour);
 *   else {
 *     Add city(curr tour, city);
 *     if (City count(curr tour) == n) {
 *       if (Best tour(curr tour))
 *         Update best tour(curr tour);
 *       Remove last city(curr tour);
 *     } else {
 *       Push(stack, NO CITY);
 *       for (nbr = n!1; nbr >= 1; nbr!!)
 *         if (Feasible(curr tour, nbr))
 *           Push(stack, nbr);
 *     }
 *   } // if Feasible
 * } // while !Empty 
 */

/*
 * Push copy(stack, tour); // Tour that visits only the hometown
 * while (!Empty(stack)) {
 *   curr tour = Pop(stack);
 *   if (City count(curr tour) == n) {
 *     if (Best tour(curr tour))
 *       Update best tour(curr tour);
 *   } else {
 *     for (nbr = n!1; nbr >= 1; nbr!!)
 *       if (Feasible(curr tour, nbr)) {
 *         Add city(curr tour, nbr);
 *         Push copy(stack, curr tour);
 *         Remove last city(curr tour);
 *       }
 *   }
 *   Free tour(curr tour);
 * }
 */

public class NRDFS {

	private val size: Int;
	
	public var pilha:Stack[Tour] = new Stack[Tour]();

	private val distMatrix:Array_2[Int];
	private var Bestcost:Int;
	private var BestTour:Tour;
	
	public def GetBestCost () : Long
	{
		var List:ArrayList[Int] = BestTour.GetList();
		
		var id : Int = 0 as Int;
		id = (List.size() - 1) as Int;
		return Bestcost + distMatrix(id, 0);
	}
	
	public def this(size:Int,matrix:Array_2[Int]) {
	  this.size = size;
	  distMatrix = matrix;
	  Bestcost = Int.MAX_VALUE;
	}
		
	private def BestTour(t_tour:Tour): Boolean{	
		var value:Int = 0 as Int;
		var List:ArrayList[Int] = t_tour.GetList();
		
		//Console.OUT.println("print tour");
		//t_tour.PrintTour();
		
		for(i in 0 .. (List.size()-2)) {
			var x:Int = List.get(i);
			var y:Int = List.get(i+1);
			value+=distMatrix(x,y);
		}
		if (value < Bestcost){
			Bestcost = value;
			return true;
		}
		else{
			return false;
		}
	}
	
	private def CityCount(t_tour:Tour):Int{        
		return t_tour.GetSize() as Int;
	}
	
	private def Removelastcity(t_tour:Tour){
		t_tour.RemoveNode();
	}
	
	private def Feasible(t_tour:Tour,i:Int):Boolean{
		var resp:Boolean = false;
			var ind:ArrayList[Int] = t_tour.GetList();
			var contains:Boolean = false;
			for(j in 0 .. (ind.size()-1)){
				if(i == ind(j) as Int){
					return false;
				}
			}
			
			t_tour.SetNodeVisited(i);
			return true;
			
	}
	
	private def AddCity(t_tour:Tour,i:Int){
		t_tour.AddNode(i);
		t_tour.SetNodeVisited(i);
	}
	
	private def UpdateBestTour(t_tour:Tour){
		BestTour = t_tour;
	}
	
	public def addTour(t_tour:Tour){
		pilha.push(t_tour);
	}
	
	public def Solve(){
		while(!pilha.isEmpty()){
			var curr_tour:Tour = pilha.pop();
			//Console.OUT.println("size " + CityCount(curr_tour));
			if (CityCount(curr_tour) == (size) as Int){
				//Console.OUT.println("try to catch best");
				if(BestTour(curr_tour)){
				  UpdateBestTour(curr_tour);
				}
			}
			else{
				for (var i:Int = (size-1) as Int; i > 0 as Int; i= i - 1 as Int){
					   if (Feasible(curr_tour, i as Int)) {
						  AddCity(curr_tour, i as Int);
						  var m_array:ArrayList[Int] = curr_tour.GetList().clone();
						  var newtour:Tour = new Tour(m_array,size);
						  pilha.push(newtour);
						  Removelastcity(curr_tour);
					   }
				}
			}
		}
		
		//Console.OUT.println("print best tour");
		//BestTour.PrintTour();
	}
	
	public static def main(Rail[String]) {
	
	}
	
}
