package examples;

public class PLH {
  static val places = Place.places();
  static val c = PlaceLocalHandle.make[Cell[Long]](places, ()=>new Cell[Long](-1));

  static public def main(Rail[String]) {
    // Console.OUT.println("static");
    for(p in places) at(p) {
      c()(p.id);
    }

    Console.OUT.println("static");
    for(p in places) at(p) {
      Console.OUT.println(here.id + " " + c()());
    }

    val c = PLH.c;
    Console.OUT.println("local");
    for(p in places) at(p) {
      Console.OUT.println(here.id + " " + c()());
    }
  }
}
