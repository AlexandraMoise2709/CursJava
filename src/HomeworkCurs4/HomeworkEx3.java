package HomeworkCurs4;

import java.util.Scanner;

public class HomeworkEx3 {

	int punctaj;
	
	public void calculeazaCalificativ() {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Punctajul:");
		punctaj = scan.nextInt();
	}	
		public void atribuieCalificativ() {
			calculeazaCalificativ();
		
		String calificativ = (punctaj > 80 )? (punctaj>=90)? "FB" : "B":"S";
			
		System.out.println("Ai primit: " + calificativ);
		
	}
	
	}


