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
  
  
  /*
  // Use native code in all backends:
  //@Native("c++","printf(\"Hello World!\\n\")")
  @Native("java","System.out.println(\"Hello World!\")")
  private static native def test1 () : void;

  // Only use native code in C++ backend:
  //@Native("c++","printf(\"Hello World!\\n\")")
  private static def test2 ():void {
	  // X10 generated code used for Java backend
	  val x : Int;
	  x = 2 as Int;
	  //{ @Native("c++","printf(\"Hello World! %d\\n\", x);") {} }
	  { @Native("java","System.out.println(\"This is the number \"+(x));" ){}}
  }

  // Use function parameters in native code
  // #0 is the name of the class (Test in this case)
  // #1, #2, #3, etc. numbered parameters
  // #x, #fd etc. named parameters
  //@Native("c++","printf(\"This is the number %d\\n\", (#1))")
  @Native("java","System.out.println(\"This is the number \"+(#x))")
  private static native def test3 (x:Int) : void;
  */
}
