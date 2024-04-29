package Homeworkcurs13;

import java.util.Scanner;

public class ExecutieCaloriesFile {

	public static void main(String[] args) {
		String key;
		
		FisierPropertiesCalorii obj = new FisierPropertiesCalorii();
		//obj.writeCaloriesPropertiesFile();
		
		System.out.println("Ce leguma vrei sa cumperi?");
		Scanner scan = new Scanner(System.in);
		key = scan.next();
		
		obj.readCaloriesPropertiesFile(key);

	}

}
