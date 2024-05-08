package HomeworkCurs14;

public class StringsBuilder {

     static String text = "Lorem ipsum dolor sit amet, consectetur" +
            "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu" +
            "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus," +
            "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius" +
            "malesuada. Nulla neque lacus, euismod quis erat nec, convallis" +
            "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat." +
            "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
     static String wordToCheck = "Nulla";

    public static void main(String[] args) {
    	
    	//addNewLine(text);
//    	int occurences = countOccurrences(text,wordToCheck);
//    	System.out.println(occurences);
    	
    	deleteChar(text);
    	
            }
    
    
    	public static void addNewLine(String text) {
    		
    		String stringModified = text.replace(".",".\n");
    		
    		System.out.println(stringModified);
    		
    		
    	}
    	
    	
    	//Prima metoda va verifica de catre ori apare cuvantul “Nulla” in
    	//acest string si va printa numarul
    
    
    	
    	
    	
		public static int countOccurrences(String text, String wordToCheck){   		
    
    		
//    			int count = 0;
//    	        int index = 0;
//
//    	        while ((index = text.indexOf(wordToCheck, index)) != -1) {
//    	            count++;
//    	            index += wordToCheck.length();
//    	            
//    	        }
			int count =0;
    		for(int i=0;i<text.length();i++) {
    			
    			
    			if(text.indexOf(wordToCheck, i)==i) {
    				
    				count++; 
    				i += wordToCheck.length() - 1;
    				
    			} 
    		}
			return count;		
    		

		}        
    		
			public static void deleteChar(String text) {
				
			StringBuilder stb = new StringBuilder();
			char charToDelete = 'a';
			for (int i =0; i<text.length();i++) {
				
				if(stb.charAt(i) == charToDelete) {
					
					stb.deleteCharAt(i);
					i--;
					
				} System.out.println(text);
			}
				
			}
			
    		
    		
    	
    	
    	
    	
    	
    
    
    
}
