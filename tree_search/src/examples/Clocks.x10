package examples;

public class Clocks {
  public static def main(Rail[String]) {
    clocked finish { // anonymous clock
      for(1..4) clocked async {
        Console.OUT.println("Phase 1");
        Clock.advanceAll();
        Console.OUT.println("Phase 2");
      }
    }

    finish { // named clock
      val c = Clock.make();
      for(1..4) async clocked(c) {
        Console.OUT.println("Phase 3");
        c.advance();
        Console.OUT.println("Phase 4");
      }
      c.drop();
    }
  }
}
