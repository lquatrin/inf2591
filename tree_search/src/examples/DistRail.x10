package examples;

public class DistRail[T](size:Long) {
  protected val chunk:Long;
  protected val raw:PlaceLocalHandle[Rail[T]];

  public def this(size:Long){T haszero} {
    property(size);
    assert(size%Place.numPlaces() == 0); // to keep it simple
    val chunk = size/Place.numPlaces(); this.chunk = chunk;
    raw = PlaceLocalHandle.make[Rail[T]](Place.places(), ()=>new Rail[T](chunk));
  }

  public operator this(i:Long) = (v:T) { at(Place(i/chunk)) raw()(i%chunk) = v; }

  public operator this(i:Long) = at(Place(i/chunk)) raw()(i%chunk);

  public static def main(Rail[String]) {
    val v = new DistRail[Long](256);
    v(135) = Place.numPlaces(); Console.OUT.println(v(135));
  }
}
