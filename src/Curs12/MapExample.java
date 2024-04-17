package Curs12;
//CRUD operations
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		/*
		 * user = test;
		 * 
		 * 
		 * 
		 */
		
		Map <String, String> map = new HashMap<>(); 
		//HasMap <String, String> map2 = new HashMap<>(); 
		

		
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("S", "Support");
		
	
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		
		System.out.println(map.get("M"));
		
		map.put("D", "Director");
		System.out.println(map);
		//all keys are case sensitive
		
		
		System.out.println(map.get("X"));
		map.put("B", null);
		System.out.println(map);
		
		
		for(String key : map.keySet())
			System.out.println(key);
		System.out.println("-----------------");
		
		for(String value : map.values())
			System.out.println(value);
		
		boolean checkkey = map.containsKey("D");
		System.out.println(checkkey);
		
		
		boolean checkValue = map.containsValue("Tester");
		System.out.println(checkValue);
		
		map.remove("D");
		System.out.println(map);
		
		map.replace("S", "Sales");
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map);
		System.out.println("-----------------");
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rosu");
		map1.put(2, "Alb");
		map1.put(3, "Verde");

		Map<Integer, String> map2 = new HashMap<>();
		map1.put(1, "Violet");
		map1.put(5, "Negru");
		map1.put(6, "Verde");
		
		System.out.println("Map1 "+ map1);
		System.out.println("Map2 "+ map2);
		map1.putAll(map2);
		
		System.out.println(map1);

		
	}

}
