package tree_search;
import x10.util.Stack;
import x10.array.Array;
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

	public val size: Int;
	
	public val pilha:Stack[Tour] = new Stack[Tour]();
	//public var tour:Array[Int];
	public def this(size:Int) {
	  this.size = size;
	  curr_tour = new Tour();
	}
	
	public def BestTour(t_tour:Tour): Boolean{
		
		return false;
	}
	
	public def CityCount(t_tour:Tour):Int{
		
		return 0;
	}
	
	public def Removelastcity(t_tour:Tour){
		
		
	}
	
	public def Feasible(t_tour:Tour,i:Int):Boolean{
		
		return false;
	}
	
	public def AddCity(t_tour:Tour,i:Int){
		
	}
	
	public def Search(){
		/**
		 *To do
		while(!pilha.isEmpty()){
			curr_tour = pilha.pop();
			if (CityCount(curr_tour)==size){
				if(BestTour(curr_tour)){
					
				}
			}
			else{
				
				for (i in (size-1)..0){
					   if (Feasible(curr_tour, i)) {
						  Addcity(curr_tour, i);
						  pilha.push(curr_tour);
						  Removelastcity(curr_tour);
						}
				}
			}
		}**/	
	}
	

}
