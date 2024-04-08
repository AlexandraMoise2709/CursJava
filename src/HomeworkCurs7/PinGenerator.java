package HomeworkCurs7;

import java.util.Scanner;

public class PinGenerator {

	static Scanner scan = new Scanner(System.in);
	static final String PIN_DEFAULT = "1234";
	static String pinIntrodus;
	static int numarIncercari = 3;

	public static void main(String[] args) {
		System.out.println("Te rog introdu un pin.Ai 3 incercari");


		while (numarIncercari>0){
			pinIntrodus = scan.next();
			if(pinIntrodus.equals(PIN_DEFAULT)){
				System.out.println("Acces granted");
				break;
			}else numarIncercari--;
			System.out.println("Wrong PIN");
            if (numarIncercari > 0) {
                System.out.println("Mai ai " + numarIncercari + " incercari. Mai introdu o data:");
            }
			if  (numarIncercari==0)  {
				System.out.println("Maximum attempts reached. Card blocked");
			}
		}
	}

}