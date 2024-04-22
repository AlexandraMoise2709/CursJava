package curs13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileProcessor {

	
	/*
	 * {"name": "oana"} *  }
	 * 
	 * 
	 * 
	 */
	
	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Oana");		
		jsonObj.put("email", "oana@oana.com");
		
		
		try(FileWriter output  =new FileWriter("test.json")){
			
			output.write(jsonObj.toJSONString());
		}catch(IOException e) {
			
			System.out.println("Nu am putut scrie fisirul");
			e.printStackTrace();
			
			
		}
		
		
		
		
		
	}
	
	
	public void readJsonFile(String key) {
		
		try(FileReader input = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(input);
			String value = (String) jsonObj.get(key);
			System.out.println(value);
		}catch(Exception e) {
			
			System.out.println("Nu am putut cityi fisirul");
			e.printStackTrace();
			
			
		}
		
		
	}
}
