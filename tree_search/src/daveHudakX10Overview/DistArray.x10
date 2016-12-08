package daveHudakX10Overview;

import x10.regionarray.Region;
import x10.regionarray.Dist;
import x10.regionarray.DistArray;

import x10.array.DistArray;
import x10.io.CustomSerialization;

public class DistArray {
	public static def main(args:Rail[String]):void {
		val arraySize = 12;
		val R : Region(1) = Region.makeRectangular(1, arraySize);
			  
		val dmu = Dist.makeUnique();
		val mkblc = Dist.makeBlock(R);
		val rhere = Dist.makeBlock(R)|here;
		
		//val testArray : DistArray[Int] = DistArray.make[x10.lang.Int](
			//	Dist.makeBlock(R)
			//	,
		//	//		([i]:Point)=>i
		//	);
			
	/*
	* val localSum = DistArray.make[Int](Dist.makeUnique(), ((Point)=>0));
	  
	* finish {
	* for (p in testArray.dist.places()) {
	* async at (p) {
	* for (localPoint in testArray|here) {
	* localSum(p.id) += testArray(localPoint);
	* }
	* }
	* }
	* }
	* var globalSum:Int = 0;
	* for (p in localSum.dist.places()) {
	* globalSum += (at (p) localSum(p.id));
	* }
	* }
 
	* val counterArray = DistArray.make[Counter](Dist.makeUnique());
	* val counterArrayPlaces = counterArray.dist.places();
	* for (p in counterArrayPlaces) {
	* at (p) {
	* counterArray(p.id) = new Counter(p.id);
	* }
	* }
	* for (p in counterArrayPlaces) {
	* at (p) {
	* val myCounter = counterArray(p.id);				
	* val myCounterValue = myCounter.getCount();
	* Console.OUT.println("Start "+p.id+":  myCounter = "+myCounterValue);
	* }
	* }


		  
		  
		  
		  
		  
		 */
		
	}
}