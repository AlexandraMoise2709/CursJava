package HomeworkCurs5;

import java.util.Scanner;

public class CalculTablaInmultirii {

	static Scanner scan =  new Scanner(System.in);
	static int numar;
	static int rezultatulInmultirii;
	
	public static void main(String[] args) {
		tablaInmultirii ();

	}
	
	public static void tablaInmultirii () {
		System.out.println("Please enter number: ");
		numar = scan.nextInt();
		for(int i= 1; i <=10 ; i++) {
		
			rezultatulInmultirii = numar * i;
		 
		System.out.println(numar + " * " + i + " = " + rezultatulInmultirii);
		
		
	}

}

}