package HomeWorkCurs8;

import java.util.Scanner;

public class CalculNumereArray {
	static Scanner scan = new Scanner(System.in);
	static int[] numereArray = new int[10];
	static int sum;
	
	public static void main(String[] args) {

		System.out.println("Te rog sa introduci 10 numere");
			
			for (int i = 0;i<10;i++) {
				
				numereArray[i] = scan.nextInt();
				sum +=numereArray[i];
				System.out.println("Te rog sa introduci urmatorul numar" );
				
			}
			System.out.println("Suma tuturor numerelor este: " + sum);

	}

}
