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

		
		
		String calificativ = (punctaj>=90)?"FB":(punctaj<90&&punctaj>=80)?"B":"S";

		String message = (calificativ == "FB" )? "Ai primit : FoarteBine" : (calificativ == "B") ?
				"Ai primit : Bine":"Ai primit : Suficient";
		
		System.out.println( message);

	}
	
	}


