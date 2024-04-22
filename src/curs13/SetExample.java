package curs13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	
		
		Set <String> set = new HashSet<>();
		
		System.out.println(set.size());
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("mov");
		set.add("galben");
		set.add("alb");
		set.add("rosu");
		set.add("verde");
		set.add("negru");
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		System.out.println("-------------------");
		System.out.println(set);
		
		for(String x:set) {
			
			System.out.println(x);
			System.out.println("-------------------");
			System.out.println(set.contains("maro"));
			System.out.println(set.contains("rosu"));

		}
		
		set.add("mov");
		System.out.println(set);
		
		
		Iterator<String> iterator =  set.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		
		}
		set.clear();
		System.out.println(set.size());
	}

}
