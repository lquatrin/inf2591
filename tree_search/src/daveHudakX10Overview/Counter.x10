package daveHudakX10Overview;

class Counter {
	private var n : Long = 0;
	
	def this ()
	{
		n = 0;
	}
	
	def this (var v : Long)
	{
		n = v;
	}
	
	public def Count ()
	{
		n = n + 1;
	}
	
	public def GetCount() : Long {
		return n;
	}
	
	public def bump() : Long {
		val nxt = n+1;
		n = nxt;
		return nxt;
	}
}
