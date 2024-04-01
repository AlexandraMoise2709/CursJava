package HomeWorkCurs6;

import java.util.Scanner;

public class ForAndWhile {

	
	static Scanner scan =  new Scanner(System.in);
	static int numar1;
	static int numar2;
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Introdu doua numere: ");
		numar1 = scan.nextInt();
		numar2=scan.nextInt();
		
					
			if(numar1>numar2) {
				
				for(int i= numar2;i<numar1;i++){
					if(i % 2 ==0) {
					System.out.println(i);
					}
				}
			} else if(numar1 < numar2){
				
				for(int i= numar1;i<numar2;i++){
					if(i % 2 ==0) {
					System.out.println(i);
					}
				}	
				
			} else {
				
				System.out.println("Numerele sunt egale");
			}
	}
}
	


