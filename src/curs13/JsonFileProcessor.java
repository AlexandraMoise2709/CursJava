package curs13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileProcessor {
	
	/*[
	 * { "name": "oana" ,
	 *     "browser" : "firefox"
	 *  
	 *   },
	 *   { "name": "oana" ,
	 *     "browser" : {
	 *     }
	 *  
	 *   }
	 * 
	 * ]
	 *  
	 * 
	 */
	
	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		//JSONArray
		
		JSONObject jsonObj =  new JSONObject();
		jsonObj.put("name", "Oana");
		jsonObj.put("email", "oana@oana.com");
		
		try(FileWriter output = new FileWriter("test.json")){
			
			output.write(jsonObj.toJSONString());
			
		}catch(IOException e) {
			System.out.println("Nu am putut scrie fisierul");
			e.printStackTrace();
		}
		
	}
	
	public void readJsonFile(String key) {
		
		try(FileReader input = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject)parser.parse(input);
			
			String value = (String )jsonObj.get(key);
			System.out.println(value);
			
		}catch(Exception e) {
			System.out.println("Nu am putut citi fisierul");
			e.printStackTrace();
		}
		
		
		
	}
	
	public void updateJsonFile(String key, String value) {
		
		try(FileReader input  = new FileReader("test.json"){
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(input);
			jsonObj.put(key, value);
			
			
			
		}}catch(Exception e) {
			System.out.println("Nu am putut citi fisierul");
			e.printStackTrace();
		}
		
	}
	

}