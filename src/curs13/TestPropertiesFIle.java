package curs13;

public class TestPropertiesFIle {

	public static void main(String[] args) {
	PropertiesFileProcessor obj = new PropertiesFileProcessor();
	
	//obj.writePropertiesFile();
	
	obj.readPropertiesFile("port");
	obj.readPropertiesFile("user");
	obj.readPropertiesFile("browser");
	
	
	
	System.out.println("----------------------");
	
	obj.updatePropertiesFile("browser", "Edge");
	obj.updatePropertiesFile("user", "utilizator");
	
	obj.readPropertiesFile("user");
	obj.readPropertiesFile("browser");
	}

}
