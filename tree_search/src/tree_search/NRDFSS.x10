package tree_search;
import x10.util.Stack;
import x10.array.*;
import x10.lang.Int;
import tree_search.RDFS;
import x10.util.*;

public class NRDFSS {

	private val size: Int;
	
	public var pilha : TourStack;
	
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
	  
	  var max_size_stack : Int = (((this.size * this.size) + 1 as Int) / 2 as Int);
	  this.pilha = new TourStack(max_size_stack, size);
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
		this.pilha.Push(t_tour);
	}
	
	public def Solve(){
		var curr_tour : Tour = new Tour(this.size);
		while(!this.pilha.IsEmpty()){
			curr_tour.Copy(this.pilha.GetLastTour());
			this.pilha.Remove();
			
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

						  curr_tour.SetCurrCost(
								  curr_tour.GetCurrCost() + 
								  distMatrix(s_2, i)
						  );
						  
						  addTour(curr_tour);
							  
						  Removelastcity(curr_tour);
						  
						  curr_tour.SetCurrCost(
								  curr_tour.GetCurrCost() - 
								  distMatrix(s_2, i)
						  );
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
