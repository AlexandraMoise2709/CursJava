package HomeWorkCurs6;

import java.util.Scanner;

public class SumaCifrelorUnuiNumar {
	static Scanner scan =  new Scanner(System.in);
	static String numar;//ca sa ii pot calcula lungimea
	static int numberDigits;
	static int suma;
	
	public static void main(String[] args) {
		
	System.out.println("Introdu numarul pentru care vrei sa calculezi suma");
	numar = scan.next();
	numberDigits = numar.length();
	
	for(int i=0; i< numberDigits; i++) {
		
		suma += Character.getNumericValue(numar.charAt(i)); //aici am cautat pe internet
	}
		
	System.out.println("Suma numerelor este: " + suma);
		
	}
		
	}
	
	
	

