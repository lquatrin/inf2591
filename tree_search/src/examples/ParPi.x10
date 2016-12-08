package examples;
import x10.util.Random;

public class ParPi {
  public static def main(args:Rail[String]) {
    val N = Int.parse(args(0)); val P = Int.parse(args(1));
    var result:Double = 0;
    finish for(1..P) async {
      val myRand = new Random();
      var myResult:Double = 0;
      for(1..(N/P)) {
        val x = myRand.nextDouble();
        val y = myRand.nextDouble();
        if(x*x + y*y <= 1) myResult++;
      }
      atomic result += myResult;
    }
    val pi = 4*result/N;
    Console.OUT.println("The value of pi is " + pi);
  }
}
