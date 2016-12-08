package examples;

class HelloWholeWorld {
  public static def main(args:Rail[String]) {
    finish 
    for(p in Place.places()) 
      at(p) async
        Console.OUT.println(p + " says " + args(0));
    Console.OUT.println("Bye");
  }
}
