package HomeWorkCurs3;

import java.util.Scanner;

public class HomeworkEx1 {
	int age;
	
	public void askTheAge() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter your age:");
		age = obj.nextInt();
	}
		
		public void calculateAge() {
			
			askTheAge();
			if (age>=18) {
				
				System.out.println("Esti minor");
				
			}else if(age>=18 && age<65) {
				
				System.out.println("Esti adult");
				
			}else if(age<0){
				
				System.out.println("Introdu un numar pozitv");
				
			}else {
				System.out.println("Esti batran");
				
			}
			
			
			
		}
		
}		



