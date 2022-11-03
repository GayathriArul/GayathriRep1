package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer ,String > lhp=new LinkedHashMap();
		//adding 
		lhp.put(1,"CARROT");
		lhp.put(30,"BEETROOT");
		lhp.put(54,"RADDISH");
		lhp.put(91,"ONION");
		lhp.put(3,"TOMATO");
		lhp.put(76,"POTATO");
		lhp.put(45,"BRINJAL");
		System.out.println(lhp);
		
		//removing
		lhp.remove(3);
		System.out.println(lhp);
		
		
		//search
		System.out.println(lhp.containsKey(54));
		
		//accessing
		System.out.println(lhp.get(30));
		
		

	}

}
