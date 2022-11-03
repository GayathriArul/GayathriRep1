package Collections;

import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		
		//adding elements
		//homogenious collection of object
		
		ts.add("Apple");
		ts.add("Mango");
		ts.add("Banana");
		ts.add("lychee");
		ts.add("Pomogranet");
		ts.add("Grapes");
		ts.add("Strawberry");
		
		// removing an object or element
		
		ts.remove("Pomogranet");// indexing is not allowed
		
		//Search
		
		System.out.println(ts.contains("Mango"));
		
		//accessing the object using each loop
		
		for(Object o: ts)
		{
			System.out.println(o);
		}
		

	}

}
