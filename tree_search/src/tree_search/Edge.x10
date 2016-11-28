package tree_search;

public class Edge {
	public var source : int;
	public var destination : int;
	public var weight : int;
	def Edge (s : int, d : int, w : int){
		source=s;
		destination=d;
		weight=w;
	}
}