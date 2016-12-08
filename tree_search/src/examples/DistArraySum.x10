package examples;
import x10.array.*;

public class DistArraySum {
  static N = 10;

  static def sumSimple(a:DistArray[Double]):Double {
    var sum:Double = 0;
    for(pt in a) sum += at(a.place(pt)) a(pt);
    return sum;
  }

  static def sumOpt(a:DistArray_BlockBlock_2[Double]):Double {
    val sum = finish(Reducible.SumReducer[Double]()) {
      for(p in a.placeGroup()) at(p) async {
        var localSum:Double = 0;
        // for(pt in a.localIndices()) localSum += a(pt);
        for([i,j] in a.localIndices()) localSum += a(i,j);
        offer localSum;
      }
    };
    return sum;
  }
  
  public static def main(Rail[String]) {
    val a = new DistArray_BlockBlock_2[Double](N, N, (i:Long,j:Long)=>(i+j) as Double);
    // Console.OUT.println("Sum: " + sumSimple(a));
    Console.OUT.println("Sum: " + sumOpt(a));
  }
}
