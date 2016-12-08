package examples;

public class AsyncScope {
  public static def main(Rail[String]) {
    val val1 = 1;
    var var1:Long = 2;
    finish {
      val val2 = 3;
      var var2:Long = 4;
      async {
        val tmp1 = val1;  // ok
        val tmp2 = val2;  // ok
        val tmp3 = var1;  // ok
       // val tmp4 = var2;  // illegal
      }
      async {
        var1 = 5;         // ok
       // var2 = 6;         // illegal
      }
    }
  }
}
