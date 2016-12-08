package examples;
import x10.util.Random;

public class DistPi {
  public static def main(args:Rail[String]) {
    val N = Int.parse(args(0));
    val result = GlobalRef[Cell[Double]](new Cell[Double](0));
    finish for(p in Place.places()) at(p) async {
      val myRand = new Random();
      var myResult:Double = 0;
      for(1..(N/Place.numPlaces())) {
        val x = myRand.nextDouble();
        val y = myRand.nextDouble();
        if(x*x + y*y <= 1) myResult++;
      }
      val myFinalResult = myResult;
      at(result) async atomic result()() += myFinalResult;
    }
    val pi = 4*result()()/N;
    Console.OUT.println("The value of pi is " + pi);
  }
}
