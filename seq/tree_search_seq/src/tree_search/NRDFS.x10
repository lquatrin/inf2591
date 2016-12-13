package tree_search;

import x10.lang.Int;
import x10.util.*;
import tree_search.Tour;
import x10.array.*;
import x10.lang.Int;

public class NRDFS {

	private val size: Int;
	
	public var pilha:Stack[Tour] = new Stack[Tour]();

	private val distMatrix:Array_2[Int];
	private var Bestcost:Int;
	private var BestTour:Tour;
	
	public def this(size:Int,matrix:Array_2[Int]) {
	  this.size = size;
	  distMatrix = matrix;
	  Bestcost = Int.MAX_VALUE;
	}
	
	private def BestTour(t_tour:Tour): Boolean{	
		var value:Int = 0 as Int;
		var List:ArrayList[Int] = t_tour.GetList();
			
		for(i in 0 .. (size-2)) {
			var x:Int = List.get(i);
			var y:Int = List.get(i+1);
			value+=distMatrix(x,y);
		}
		
		value+=distMatrix(List.get(size-1),0);
		
		if (value < Bestcost){
			Bestcost = value;
			t_tour.AddNode(0 as Int);
			//Console.OUT.println("best cost " + Bestcost);
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
		var value:Int = 0 as Int;
		t_tour.AddNode(i);
		t_tour.SetNodeVisited(i);
		var List:ArrayList[Int] = t_tour.GetList();
		var x:Int = List.get(List.size()-2);
		var y:Int = List.get(List.size()-1);
		value = distMatrix(x,y);
		t_tour.SetCurrCost (value);
	}
	
	private def UpdateBestTour(t_tour:Tour){

		BestTour = t_tour;
	}
	
	public def addTour(t_tour:Tour){
		pilha.push(t_tour);
	}
	
	
	public def CheckBestTourPartialCost (tour_cost : Long) : Boolean{
		if (tour_cost < Bestcost)
		{
			return true;
		}
		return false;
	}
	
	public def Solve(){
		while(!pilha.isEmpty()){
			
			
			var curr_tour:Tour = pilha.pop();
			//Console.OUT.println("size " + CityCount(curr_tour));
			if (CheckBestTourPartialCost(curr_tour.GetCurrCost ())){
				if (CityCount(curr_tour) == (size) as Int){
					if(BestTour(curr_tour)){
				  		UpdateBestTour(curr_tour);
					}
				}
				else{
					for (var i:Int = (size-1) as Int; i >= 0 as Int; i= i - 1 as Int){
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
		}
		Console.OUT.println("print best tour");
		BestTour.PrintTour();
	}
	
	public static def main(Rail[String]) {
	
	}
	
}