package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		Set<String> set=new HashSet<>();
		
		set.add("shweta");
		set.add("techbodhi");
		set.add("khode");
		set.add("shweta");
		
		
		// random value
		for(String s:set )
		{
			System.out.println(s);
		}
		System.out.println("************");
		// preserve to insertion order (same order)
         set=new LinkedHashSet<>();
		
		set.add("shweta");
		set.add("techbodhi");
		set.add("khode");
		set.add("shweta");
		
		for(String s:set )
		{
			System.out.println(s);
		}
		System.out.println("************");
		
		// alphabete order set
        set=new TreeSet<>();
		
		set.add("shweta");
		set.add("techbodhi");
		set.add("khode");
		set.add("shweta");
		
		for(String s:set )
		{
			System.out.println(s);
		}
		System.out.println("************");
	}

}
