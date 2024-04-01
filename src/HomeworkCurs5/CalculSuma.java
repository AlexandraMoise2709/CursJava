package HomeworkCurs5;

import java.util.Scanner;

public class CalculSuma {
	
	static Scanner scan =  new Scanner(System.in);
	static int sum;
	static int numar;

	public static void main(String[] args) {
		calculSuma();

	}
	
	
	public static void calculSuma() {
		
		
			for(int i= 1; i <=10 ; i++) {
			System.out.println("Please enter number "+ i+ ":");
			numar = scan.nextInt();
			sum += numar;	
			
			
		}	
			System.out.println("The sum of the numbers is: " + sum);
		
	}

}
