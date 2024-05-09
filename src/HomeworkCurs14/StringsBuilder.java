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
    	
    	
    	int occurences = countOccurrences(text,wordToCheck);
    	System.out.println(occurences);
    	addNewLine(text);
    	deleteChar(text);
    	replaceWithSB(text);
   
    	
            }
    //numara aparitia cuvantului nulla
		public static int countOccurrences(String text, String wordToCheck){   		
	    
		
		int count = 0;
        int index = 0;

        while ((index = text.indexOf(wordToCheck, index)) != -1) {
            count++;
            index += wordToCheck.length();
            
        }

	return count;		
	

}
    
    //adauga new line dupa fiecare propozitie
    	public static void addNewLine(String text) {
    		
    		String stringModified = text.replace(".",".\n");
    		
    		System.out.println(stringModified);
    		
    		
    	}
    	
    	//sterge toate 'a'-urile
    	public static void deleteChar(String text) {
				
			StringBuilder stb = new StringBuilder(text);
			char charToDelete = 'a';
			int i=0;
			
			while(i<stb.length()) {
				
				if(stb.charAt(i) == charToDelete) {
				stb.deleteCharAt(i);
				
					}i++;				 
					}
				System.out.println(stb);
				
			}
				
			

			//‘o’ cu caracterul ‘#’
		
		public static void replaceWithSB(String text) {
			char oldChar = 'o';
			char newChar = '#';
			int i=0;
			StringBuilder stb = new StringBuilder(text);
			
			while(i<stb.length()) {
				if (stb.charAt(i)==oldChar) {				
					stb.setCharAt(i, newChar);
				}i++;				
				
			}System.out.println(stb);			
				
				
			}
			
			
		}
			

