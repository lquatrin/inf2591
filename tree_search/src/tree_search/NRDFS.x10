package tree_search;
import x10.util.Stack;
import x10.array.*;
import x10.lang.Int;
import tree_search.RDFS;
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
	
	public val pilha:Stack[Tour] = new Stack[Tour]();
	private val listofvisited:Array_1[Int];
	private val distMatrix:Array_2[Int];
	private val Bestcost:Int;
	
	public def this(size:Int,matrix:Array_2[Int]) {
	  this.size = size;
	  distMatrix = matrix;
	  listofvisited = new Array_1[Int](size as Long);
	  for (i in 0..(size-1)){ 
		  listofvisited(i) = 0 as Int;
	  }
	  Bestcost = Int.MAX_VALUE;
	}
	
	private def BestTour(t_tour:Tour): Boolean{	
		return false;
	}
	
	private def CityCount(t_tour:Tour):Int{
		
		return  0 as Int;
	}
	
	private def Removelastcity(t_tour:Tour){
		
		
	}
	
	private def Feasible(t_tour:Tour,i:Int):Boolean{
		
		return false;
	}
	
	private def AddCity(t_tour:Tour,i:Int){
		
	}
	
	private def UpdateBestTour(t_tour:Tour){
		
		
	}
	
	
	public def Search(){
		while(!pilha.isEmpty()){
			val curr_tour:Tour;
			curr_tour = pilha.pop();
			if (CityCount(curr_tour)==size){
				if(BestTour(curr_tour)){
					UpdateBestTour(curr_tour);
				}
			}
			else{
				for (i in (size-1)..0){
					   if (Feasible(curr_tour, i as Int)) {
						  AddCity(curr_tour, i as Int);
						  pilha.push(curr_tour);
						  Removelastcity(curr_tour);
						}
				}
			}
		}
	}
	
}
