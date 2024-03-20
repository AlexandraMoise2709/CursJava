package curs4;

import java.util.Scanner;

/* inrebam 2 nr de la tastatura
 * veificam fiecare nr daca e pozitiv
 * verificam daca ambele nr sunt pozitive
 * verificam care e cel mai mic sau daca sunt egale
 */

public class TernaryOperatorExemple {

	
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pimul nr");
		num1= scan.nextInt();
		
		System.out.println("Al doilea nr");
		num2= scan.nextInt();	
		
		//veriicam daca primul nr este pozitiv
		
		if (num1>0){
			System.out.println("Nr 1 este pozitiv");
			
		}else {
			
			System.out.println("Nr 1 este negativ");
		}
			//conditie ? expresie true: expresie false
		
		String result = (num1>0) ? ("Nr 1 este pozitiv"):("Nr 1 este negativ");
		System.out.println(result);
		
		result = (num2>0) ? ("Nr 2 este pozitiv"):("Nr 2 este negativ");
		System.out.println(result);
		
		 result = (num1>0&& num2>0) ? ("suntpozitive"):("cel putin unul este negativ");
		 System.out.println(result);
		
		 result = (num1 > num2)? "num1 este mai mare":
			 (num1 < num2) ? "num2 este mai mare": "Sunt egale";
		 
		 System.out.println(result);
	}

}
