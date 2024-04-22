package curs13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Iasi","Cluj","Pitesti","Constanta","Ploiesti","Arad","oradea"));
		
		System.out.println(list.size());
		
		list.add("Oradea");
		System.out.println(list.size());
		
		System.out.println(list);
		
		System.out.println(list.subList(0, 3));
		
		List <String> subLista = list.subList(0, 3);
		list.subList(0, 5).clear();
		
		System.out.println(list);
		
		
		System.out.println("--------");
		

			
			
		}
	} 


