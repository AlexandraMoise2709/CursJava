package Homeworkcurs12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {
		
		Map<String, Integer> catalog = new HashMap<>(); 
		
		catalog.put("Andrei", 7);
		catalog.put("Oana", 6);
		catalog.put("Corina", 5);
		
		
		
		System.out.println("Te rog sa imi spui numele tau");
		try (Scanner scan = new Scanner(System.in)) {
			String key = scan.next();
			System.out.println("Ce nota ai luat?");
			
			int value = scan.nextInt();
			
			boolean checkKey = catalog.containsKey(key);
			
			if (checkKey) {
			    if (value > catalog.get(key)) {
			        catalog.replace(key, value);
			        System.out.println();
			    } else {
			        System.out.println("Nu ai nevoie de alta nota!");
			    }
			} else {
			    catalog.put(key, value);
			    System.out.println("Nu aveai nota, ti-am trecut acum!");
			}
		}
		System.out.print(catalog);
    }

}
