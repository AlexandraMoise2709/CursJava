package HomeWorkCurs8;

import java.util.Scanner;

import java.util.Scanner;

public class ProgramDeAcordatBonusuri {

	static Scanner scan =  new Scanner(System.in);
	static int anVechime;
	static int valoareVanzari;
	static int lunaVnzari;




	public static void main(String[] args) {
		System.out.println("Introdu anul de vechime in firma");
		anVechime = scan.nextInt();
		System.out.println("Introdu valoarea vanzarilor efectuate");
		valoareVanzari = scan.nextInt();
		System.out.println("Introdu luna in care ai efectuat vanzarile");
		lunaVnzari = scan.nextInt();

		switch (anVechime) {
		case 1 : System.out.println("Ai primit un bous de 100!");
		break;
		case 2: System.out.println("Ai primit un bous de 200!");
		break;
		case 3: switch (valoareVanzari <=5000?0:1) {

			case 0:System.out.println("Ai primit un bous de 200!");
			break;					

			case 1:
				  switch  (valoareVanzari <=10000?0:1) {
				  case 0 :switch (lunaVnzari) {
											case 1:
											case 2:
											case 3:
											case 4:
											case 5:
											case 6:
												System.out.println("Ai primit un bonus de 800!");
												break;
											case 7:
											case 8:
											case 9:
											case 10:
											case 11:
												System.out.println("Ai primit un bonus de 1000!");
												break;	
											case 12:
												System.out.println("Ai primit un bonus de 1000!");
												System.out.println("In decembrie se vand singure!");
	
											default:
												System.out.println("Vechime fara bonus");
										} 
				  case 1: System.out.println("Ai primit un bonus de 1200!");
					break;
				
		}
			break;
		}
		break;
		default:
			System.out.println("Vechime fara bonus");



		}


	}	





}
	

