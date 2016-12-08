package examples;

public class Buffer[T]{T isref,T haszero} {
  protected var datum:T = null;

  public def send(v:T){v!=null} { 
    when(datum == null) {
      datum = v;
    }
  }

  public def receive() {
    when(datum != null) {
      val v = datum;
      datum = null;
      return v;
    }
  }

  public static def main(Rail[String]) {
    val buffer = new Buffer[Any]();
    finish {
      async {
        for(i in 1..10) buffer.send(i);
      }
      async {
        for(i in 1..10) Console.OUT.println(buffer.receive());
      }
    }
  }
}
