package curs7;

import java.util.Scanner;

/*
 * facem un joc care simuleaza un joc de zaruri
 * 
 * avem urmaoarele reguli
 * 1. daca userul da in total 2 sau 6 sau 12 pierde jocul
 * 2.daca userul da in total 7 sau 11 castige jocul
 * 
 * 3.daca userul da in total 3 sau 10 atunci repeta automat aruncarea
 * 4. daca da in total orice alta varianta decat cele de mai sus il intrebam daca vrea sa mai dea inca o data
 * 
 * raspunsul lui va fi true sau false
 */

public class DiceGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		boolean raspuns = true;
		
		
		
		
		while(raspuns) {
			int zar1 = (int) (Math.random() * 6 + 1);
			int zar2 = (int) (Math.random() * 6 + 1);
			int total = zar1+zar2;
			System.out.println("Ai dat:" + total);
			if(total==2|| total ==6 || total==12) {
				
				System.out.println("Ai dat "+ total +"!ai pierdut jocul");
				break;
			}else if(total==7|| total==11) {
				
				System.out.println("Ai dat "+ total +"!ai castigat jocul");
				break;
			}else if(total==3|| total ==10) {
				
				System.out.println("Ai dat "+ total +"!automat mai dai o data");
				continue;
				
			}
			
			System.out.println("mai vrei sa dai o data?");
			raspuns= scan.nextBoolean();
		}
			
			System.out.println("Game over");
			
		}	
		
		
		
	}


