package curs6;

import java.util.Scanner;

/*
 * calculeaza saariul pe 1 sapt
 * intreba utlizatorul cate ore a lucrat
 * calculam doar daca a lucrat maxim 40 si minim 1
 * daca introduce un numar invalid il rugam sa introduca din nou
 * facem asta pana cand introduce un nr valid\
 * 
 * calculam cu formula salaiu= nr de ore lucrate*rate per hour 35
 * 
 * 
 * 
 */



public class CalculSalarial {
	
	static final int RATE_PER_HOUR = 35;
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int oreLucrate;
		System.out.println("Cate ore ai lucrat");
		
		for(oreLucrate = scan.nextInt(); oreLucrate <1 || oreLucrate > 40;oreLucrate = scan.nextInt()) {
			
			if(oreLucrate <= 40 || oreLucrate >=1) {
				System.out.println("Salariul tau este: " + oreLucrate*RATE_PER_HOUR);
				
				break;
			}else {
				System.out.println("nr invalid");
				oreLucrate = scan.nextInt();
			
			}
			
		}
	}
	
	
	
	
	
	

}

