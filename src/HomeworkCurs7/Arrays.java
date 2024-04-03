package HomeworkCurs7;

import java.util.Scanner;

public class Arrays {
	static Scanner scan = new Scanner(System.in);
	static int nr;
	static String [] lunileAnului = {"","Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
	static boolean raspuns = false;

	public static void main(String[] args) {

		while(!raspuns){
			System.out.println("Te rog sa introduci un numar");
			nr= scan.nextInt();
			if(nr>=1 && nr <=12){
				System.out.println(lunileAnului[nr]);
				raspuns = true;
			} else {
				System.out.println("Numarul este invalid");
			}
		}


	}
}