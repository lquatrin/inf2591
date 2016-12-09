package daveHudakX10Overview;

public class Atomic2Example {
    public static def main (args:Rail[String])
    {
    	var count : Int = 0 as Int;
    	finish for (val i in (1..2)) async {
			atomic { count++; } // incremen t1
			atomic { count++; } // incremen t2
		}
       	Console.OUT.println(count);
    }
}