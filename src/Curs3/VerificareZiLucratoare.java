package Curs3;

import java.util.Scanner;

public class VerificareZiLucratoare {
	int zi;
	
public void askTheUserForANumber() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		zi = scan.nextInt();		
	}

	public void verificaZi() {
		
		askTheUserForANumber();
		if(zi>=1 && zi <=5) {
			System.out.println("EsteZILucratoare");	
			
		}else if (zi==6 || zi ==7) {
			
			System.out.println("Este Weekend");	
			
		}else {
			System.out.println("zi invalida");
			
			
			
		}
		
	}
	
}
