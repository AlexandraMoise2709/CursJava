package HomeWorkCurs3;

import java.util.Scanner;

public class HomeworkEx3 {

	int zi;
	
	public void introduNumar() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter a number:");
		zi = obj.nextInt();
		
	}
	
	
	public void calculeazaZiuaSaptamanii() {
		
		introduNumar();
		
		if(zi==0) {
			
			System.out.println("Te rog sa introduci un numar ai mare ca 0");
		}else if(zi==1) {
			
			System.out.println("Astazi este luni.");
				}else if (zi==2) {
					System.out.println("Astazi este marti.");
					
				}else if(zi==3) {
					
					System.out.println("Astazi este miercuri");
				}else if(zi==4) {
					System.out.println("Astazi este joi");
					
				}else if(zi==5) {
					System.out.println("Astazi este vineri");
				}else if(zi==6) {
					System.out.println("Astazi este sambata");
				}else if(zi==7) {
					System.out.println("Astazi este duminica");
				}else {
					
					System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
				}
		
	}
}
