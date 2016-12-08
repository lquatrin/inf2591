package examples;
import x10.array.*;

public class ArraySum {
  static N = 10;

  static def reduce[T](a:Array[T], f:(T,T)=>T){T haszero} {
    var result:T = Zero.get[T]();
    for(v in a) result = f(result, v);
    return result;
  }   

  public static def main(Rail[String]) {
    val a = new Array_2[Double](N, N);
    for(var i:Long=0; i<N; ++i) for(j in 0..(N-1)) a(i,j) = i+j;
    Console.OUT.println("Sum: " + reduce(a, (x:Double,y:Double)=>x+y));
  }
}
