package Curs3;

import java.util.Scanner;

public class VerificareCaracter {
	
	char character;
	public void askTheUserForCaracter() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character:");
		character = scan.next().charAt(0);		
	}
	
	public void verificaDacaCaracterulEsteLitera() {
		askTheUserForCaracter();
		if (Character.isLetter(character)) {
			System.out.println("Caracterul este o litera");
			
		}else {
			System.out.println("Caracterul nu este o litera");
		}
		
		
	}
	
}
