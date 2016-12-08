package examples;

public class Vector[T](size:Long){T haszero,T<:Arithmetic[T]} {
  val raw:Rail[T]{self!=null,self.size==this.size};
  // this refers to the object instance, self to the value being constrained

  def this(size:Long) { property(size); raw = new Rail[T](size); }

  def add(vec:Vector[T]){vec.size==this.size}:Vector[T]{self.size==this.size} {
    for(i in 0..(size-1)) raw(i) += vec.raw(i);
    return this;
  }

  public static def main(Rail[String]) {
    val v = new Vector[Int](4); 
    val w = new Vector[Int](5);
    v.add(w);
  }
}
