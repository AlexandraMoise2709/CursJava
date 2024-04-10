package Curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {

		try {
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter number 1");
		int number1 = scan.nextInt();
	
		System.out.println("enter number 2");
		int number2 = scan.nextInt();
		number2= (Integer) null;
		
		System.out.println(number1/number2);
		}catch(ArithmeticException e) {
			System.out.println("Nu mai imparti la zero ca nu mere");
			
		}catch(InputMismatchException e) {
			System.out.println("nu mai introduce caractere ca nu merge");	
			
		} catch(NullPointerException e) {
			System.out.println("A aparut null pointer");
		}
	}

}
