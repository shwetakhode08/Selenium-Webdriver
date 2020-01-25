package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) 
	{
//		List list=new ArrayList<>();
//		
//		 u can use object at that time i can use any datatype int,string
//        list.add("shweta")
		
		List<String> list=new ArrayList<>();
		
		list.add("shweta");
		list.add("techbodhi");
		list.add("khode");
		list.add("shweta");		// list allow duplicate data
		for(String s:list)   // inhance for loop use in collection
		
		{
			System.out.println(s);
		}
		System.out.println("*******");

		list=new LinkedList<>();
		
		list.add("shweta");
		list.add("techbodhi");
		list.add("khode");
		list.add("shweta");	
		
//		System.out.println(list);
	for(String s:list)   // inhance for loop use in collection
	
		{
		System.out.println(s);
	}
		
		System.out.println("*******");
		list=new Vector<>();
		
		list.add("shweta");
		list.add("techbodhi");
		list.add("khode");
		list.add("shweta");	
		for(String s:list)   // inhance for loop use in collection
		
		{
			System.out.println(s);
		}
	}

}
