package Curs3;

import java.util.Scanner;

//citim 3 numere de la tastatura
//verifica care dintre ele este cel mai mare si printeaza in consola
//verifica si daca numerele sunt egale

public class GreatestOFThreeNumber {

	int nr1,nr2,nr3;
	public void askThreeNumbers() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter please number:");
		nr1 = obj.nextInt();
		System.out.println("Please enter please second number:");
		nr2 = obj.nextInt();
		System.out.println("Please enter please third number:");
		nr3 = obj.nextInt();

	}
		public void compareTheNumbers() {
		
		askThreeNumbers();
		if (nr1 >nr2 && nr1>nr3) {
			System.out.println("Nr1 is the greatest");		
			
			
		}
		else if (nr2 >nr3 && nr2>nr3) {
			System.out.println("Nr2 is the greatest");		
			
		}
		
		else if (nr3 >nr1 && nr3>nr1) {
			System.out.println("Nr3 is the greatest");		
			
		}else {
			System.out.println("Numbers are equal");
			
		}
		

	}
}
