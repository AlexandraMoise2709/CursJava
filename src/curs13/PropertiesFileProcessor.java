package curs13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	
	public void writePropertiesFile() {
		
		
		try(FileOutputStream output = new FileOutputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty("browser", "Firefox");
			propFile.setProperty("hostname", "server,com");
			propFile.setProperty("port", "1234");
			propFile.setProperty("url", "example.con");
			propFile.store(output, "am salvat fisierul");
			
			//output.close();
			
		}catch(IOException e) {
			
			
			System.out.println("Nu am putut scrie fisierul! ");
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void readPropertiesFile(String key) {
		
		try(FileInputStream input = new FileInputStream("test.properties")){
			
			Properties propFile = new Properties();
			
			propFile.load(input);
			propFile.get(key);
			System.out.println(propFile.getProperty(key));
			
		}catch(IOException e) {	
			
			System.out.println("Nu am putut scrie fisierul! ");
			e.printStackTrace();
		}
		
	}
			
		
		public void updatePropertiesFile(String key, String value) {
			
			
			Properties propFile = new Properties();
			
			
			
			try (FileInputStream input = new FileInputStream("test.properties")){
				propFile.load(input);
				
				
				
			}catch(IOException e) {					
				System.out.println("Nu am putut citi fisierul! ");
				e.printStackTrace();
			}
			
			
		
			try(FileOutputStream output = new FileOutputStream("test.properties")) {
				
				propFile.setProperty(key, value);
				propFile.store(output, null);
	
				
			}catch(IOException e) {	
				
				System.out.println("Nu am putut face update in fisierul! ");
				e.printStackTrace();
			}
		
		
		
		
		
		
		
	}
		
		
		public void updatePropertiesFile(String key) {
			
			try(FileInputStream input = new FileInputStream("test.properties")){
				
				Properties propFile = new Properties();
				
				propFile.load(input);
				propFile.get(key);
				System.out.println(propFile.getProperty(key));
				
			}catch(IOException e) {	
				
				System.out.println("Nu am putut scrie fisierul! ");
				e.printStackTrace();
			}
			
		
			
			try(FileOutputStream output = new FileOutputStream("test.properties")) {
				Properties propFile = new Properties();
			
				propFile.setProperty(output, null);
				propFile.store(output, null);
	
				
			}catch(IOException e) {	
				
				System.out.println("Nu am putut face update in fisierul! ");
				e.printStackTrace();
			}
			
		}
	
	
	

}
