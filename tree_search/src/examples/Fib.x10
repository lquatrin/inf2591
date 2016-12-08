package examples;

public class Fib {
  static def fib(n:Long):Long {
    if(n < 2) return n;
    val f1:Long;
    val f2:Long;
    finish {
      async f1 = fib(n-1);
      f2 = fib(n-2);
    }
    return f1 + f2;
  }

  public static def main(Rail[String]) {
    Console.OUT.println("fib(20)=" + fib(20));
  }
}
