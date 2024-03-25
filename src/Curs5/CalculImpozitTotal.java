package Curs5;

import java.util.Scanner;

public class CalculImpozitTotal {

	
	/*
	 * facem un program care calculeaza impozitul pe venit
	 * reguli
	 * intrebam nr surselor de venit
	 * pt fiecare sursa de venit calcculam dupa cum urmeaza
	 * 
	 * daca venit<= 50000 impozitul 0.1
	 * altfel impozit = 0.15 
	 * printam impozitul total 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul total de venituri: ");
		int numarVenituri = scanner.nextInt();
		final int PRAG_VENIT = 50000;
		
		double impozitTotal = 0;
		
		for(int i = 1; i<=numarVenituri;i++) {
			System.out.println("Introdu venituri nr " + i);
			double venit = scanner.nextDouble();
			
			if(venit<= PRAG_VENIT) {
				
				impozitTotal = impozitTotal + venit * 0.1;
				
			}else {
				
				impozitTotal = impozitTotal + venit * 0.15;
			}
			
		}
		
		System.out.println("Impozit total de plata este: " + impozitTotal);
		
		

	}

}
