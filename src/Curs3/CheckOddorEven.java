package Curs3;

import java.util.Scanner;

public class CheckOddorEven {
	int number;
	public void askTheUserForANumber() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		number = scan.nextInt();		
	}
	
	public void checkNrIsOddOrEven() {
		askTheUserForANumber();
		if(number % 2 == 0) {
			System.out.println("Number is even");
			
			
		}else{
			System.out.println("Number is odd");
			
		}
		
	}

}
