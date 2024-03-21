package HomeWorkCurs3;

import java.util.Scanner;

public class HomeworkEx2 {
	int punctaj;
	
	public void introduPunctaj() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your score:");
		punctaj = obj.nextInt();
		
	}
	
	public void calculeazaPunctaj() {
		
		introduPunctaj();
		
		if (punctaj<=65) {
			
			System.out.println("Ai picat.Mai incearca");
		}else {
			
			System.out.println("Felicitari.Ai trecut");
		}
		
	}
	
}
