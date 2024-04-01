package HomeWorkCurs6;

import java.util.Scanner;

public class NumarInversat {

	static Scanner scan =  new Scanner(System.in);
	static String numar;
	static String  numarIntors = "";
	
	
	public static void main(String[] args) {
		
		System.out.println("Introdu numarul pe care vrei sa il inversezi");
		numar = scan.next();
		int x = numar.length();
		
		while(x>0) {
			
			numarIntors = numarIntors + numar.charAt(x-1);
			x--;
			
		}
		
		System.out.println(numarIntors);
	}

}
