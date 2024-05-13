package Homeworkcurs13;

import java.util.Scanner;

public class ExecutieCaloriesFile {

	public static void main(String[] args) {
		
		
		FisierPropertiesCalorii obj = new FisierPropertiesCalorii();
		obj.writeCaloriesPropertiesFile();
		
		System.out.println("Ce leguma vrei sa cumperi?");
		
		try (Scanner scan = new Scanner(System.in)) {
			String key = scan.nextLine();

			
			obj.readCaloriesPropertiesFile(key);
		}

	}

}
