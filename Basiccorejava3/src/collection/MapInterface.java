package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
//		KEY       VALUE
//		NAME     SHWETA
//		Surname  khode
//
//
//		id    name
//		1    Shweta
//		2    Ruhi

		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "Shweta");
		map.put(2, "Ruhi");
		map.put(1, "Puja");
		map.put(null,"Amit");
		
			System.out.println(map.get(1));	
		System.out.println(map.get(null));
		
		
			map=new Hashtable<>();
			
			map.put(1, "Shweta");
			map.put(2, "Ruhi");
			map.put(1, "Puja");
			map.put(null,"Amit");
			
				System.out.println(map.get(1));	
				System.out.println(map.get(null));
		
		
			
	}

}
