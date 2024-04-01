package HomeworkCurs5;
//9/5+32
import java.util.Scanner;

public class CalculatorTemperatura {


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numarul de temperaturi pe care vrei sa le transformi: ");
		int numarTemp = scan.nextInt();
		
		for(int i = 1; i<= numarTemp; i++) {
			System.out.println("Introdu o temperatura");
			double tempC ;
			tempC = scan.nextDouble();
			double temperaturaF = tempC * 9/5+32;
			
			System.out.println("Temperatura Celsius de " + tempC+ " grade este in Farenheit "+temperaturaF+ " grade " );
			
		}
		
		
		
		
		
	}

}