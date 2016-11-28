package tree_search;


/*
 * void Depth first search(tour t tour) {
 *   city t city;
 * 
 *   if (City count(tour) == n) {
 *     if (Best tour(tour))
 *       Update best tour(tour);
 *   } else {
 *     for each neighboring city
 *       if (Feasible(tour, city)) {
 *         Add city(tour, city);
 *         Depth first search(tour);
 *         Remove last city(tour, city);
 *       }
 *     }
 *   } // Depth first search
 */

public class RDFS {
	public val x: Double;
	public val y: Double;
	public def this(x: Double, y: Double) {
		this.x = x; this.y = y;
	}
	
	public def magnitude() = x*x + y*y;	
}