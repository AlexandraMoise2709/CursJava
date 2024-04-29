package Homeworkcurs13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FisierPropertiesCalorii {

public void writeCaloriesPropertiesFile() {
		
		try(FileOutputStream output =  new FileOutputStream("calorii.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty("castravete", "100 calorii");
			propFile.setProperty("rosie", "10 calorii");
			propFile.setProperty("varza", "150 calorii");
			propFile.setProperty("pastarnac", "250 calorii");
			propFile.setProperty("broccoli", "350 calorii");
			
			propFile.store(output, "am salvat fisierul");
			
			//output.close();
		}catch(IOException e){	
			System.out.println("Nu am putut scrie fisierul!");
			e.printStackTrace();
		}
		
	}

	public void readCaloriesPropertiesFile(String key) {

		try(FileInputStream input =  new FileInputStream("calorii.properties")){

		Properties propFile =  new Properties();
		propFile.load(input);
		
		if(key!=null) {
			String value = propFile.getProperty(key);
		
		
		 if (value!=null) {
			 
			 System.out.println("Leguma aleasa de tine are " + value );
		 }else {
			 System.out.println("Leguma aleasa de tine nu exista");
			 System.out.println("Te rog introdu alta ");		 }
		 

		} else {
			
			System.out.println("Leguma aleasa de tine nu exista");
		}
		

	}catch(IOException e) {
		System.out.println("Nu am putut citi fisierul");
		e.printStackTrace();
	}

	}
}

	
	

