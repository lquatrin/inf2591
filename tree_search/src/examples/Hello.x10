package examples;
import x10.io.Console;

public class Hello {                             // class
  protected val n:Long;                          // field

  public def this(n:Long) { this.n = n; }        // constructor

  public def test() = n > 0;                     // method

  public static def main(args:Rail[String]) {
    Console.OUT.println("Hello world! ");
    val foo = new Hello(args.size);              // inferred type
    var result:Boolean = foo.test();             // no inference for vars
    if(result) Console.OUT.println("The first arg is: " + args(0));
  }
}
