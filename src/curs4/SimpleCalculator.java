package curs4;

import java.util.Scanner;

/*
 * simulator calculator de baza
 * stie doar +,-,* sau X, imartire /:
 * 
 * printam rezultatul exo 2+2=4
 * 
 * itrebam userul primul nr 
 * intrebam operatia matematica
 * 
 * interba al doilea nr 
 * printam
 * 
 * 
 */

public class SimpleCalculator {
		int num1, num2, num2, num3;
		char operatie;

	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu primul numar:");
		
		num1 = nextInt();
		
		System.out.println("Please operation:");
		
		num2 = scan.next().charAt(0);
		
		
		System.out.println("Introdu al doilea numar:");
		
		num3 = nextInt();
		
		
		
	}
	
	public void calculeazaValori() {
		askTheUser();
		
		if(operatie=='+') {
			result = num1+num3;	
			
		}else if (operatie=='-') {
			result = num1-num3;
			
		}else if (operatie=='*' || operatie == 'X') {
			result = num1 * num3;
		}else  if (operatie == '/'|| operatie ==':') {
			result = num1/num3;			
		}
			
		
		
	}
	
	public void printeazaValori() {
		
		System.out.println(num1 + num2+ " = " + result );
		
	}
}
