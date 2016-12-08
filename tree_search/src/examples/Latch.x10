package examples;

public class Latch {
  private var b:Boolean = false;
  def release() { atomic b = true; }
  def await() { when(b); }

  public static def main(Rail[String]) {
    val latch1 = new Latch();
    finish {
      async {
        latch1.await();
        Console.OUT.println("after await 1");
      }
      async {
          Console.OUT.println("before release 1");
          latch1.release();
      }
      val latch2 = new Latch();
      finish {
        async {
          Console.OUT.println("before release 2");
          latch2.release();
        }
        async {
          latch2.await();
          Console.OUT.println("after await 2");
        }
      }
    }
  }
}
