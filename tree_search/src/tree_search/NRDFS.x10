package tree_search;

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
	public val x: Double;
	public val y: Double;
	public def this(x: Double, y: Double) {
		this.x = x; this.y = y;
	}
	
	public def magnitude() = x*x + y*y;	
}
