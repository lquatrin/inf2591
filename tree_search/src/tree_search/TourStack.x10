package tree_search;

import x10.array.*;
import x10.util.*;
import tree_search.Tour;

public class TourStack {
	var list_tours : ArrayList[Tour];
	var list_size : Int;

	var max_size : Int;

	public def this (mlenght : Int, toursizes : Int)
	{
		this.max_size = mlenght;
		
		this.list_tours = new ArrayList[Tour](this.max_size);

		for(i in 0..(mlenght - 1) as Int)
		{
			this.list_tours(i) = new Tour(toursizes);
		}
		this.list_size = 0 as Int;
	}
	
	public def IsEmpty () : Boolean
	{
		return (list_size == (0 as Int));
	}
	
	public def Push (t_tour : Tour)
	{	
		this.list_tours(this.list_size).Copy(t_tour);
		this.list_size += 1 as Int;
	}
	
	public def Remove ()
	{	
		this.list_size -= 1 as Int;
	}
	
	public def GetLastTour () : Tour
	{	
		return this.list_tours(this.list_size - 1);
	}
}