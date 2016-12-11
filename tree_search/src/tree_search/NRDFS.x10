package tree_search;
import x10.util.Stack;
import x10.array.*;
import x10.lang.Int;
import tree_search.RDFS;
import Hello;
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
		return (Bestcost as Long);
	}
	
	public def GetBestTourListOfNodes () : ArrayList[Int]
	{
		return BestTour.GetListOfNodes();
	}
	
	public def this(size:Int,matrix:Array_2[Int]) {
	  this.size = size;
	  distMatrix = matrix;
	  Bestcost = Int.MAX_VALUE;
	}
		
	private def BestTour(t_tour:Tour): Boolean{	
		var value:Int = t_tour.GetCurrCost() as Int;
		
		var List:ArrayList[Int] = t_tour.GetList();
		var id : Int = List((List.size() - 1)) as Int;
		value += (distMatrix(id, 0) as Long);
		
		if (value < Bestcost){
			Bestcost = value as Int;
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
	
	private def AddCity(t_tour:Tour, i:Int){
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
			
			if (curr_tour.GetCurrCost() < Bestcost)
			{
				if (CityCount(curr_tour) == (size) as Int){
					if(BestTour(curr_tour)){
					  UpdateBestTour(curr_tour);
					}
				}
				else{
					for (var i:Int = (size-1) as Int; i > 0 as Int; i= i - 1 as Int){
					   if (Feasible(curr_tour, i as Int)) {
						  AddCity(curr_tour, i as Int);
							  			
						  var s_2 : Int = curr_tour.GetCityNode((curr_tour.GetSize() - 2) as Int);
							  
						  var m_array:ArrayList[Int] = curr_tour.GetList().clone();
						  var newtour:Tour = new Tour(m_array,size);
						  newtour.SetCurrCost(
								  curr_tour.GetCurrCost() + 
								  distMatrix(s_2, i)
						  );
						  
						  pilha.push(newtour);
							  
						  Removelastcity(curr_tour);
					   }
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
