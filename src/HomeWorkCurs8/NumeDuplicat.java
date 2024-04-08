package HomeWorkCurs8;

public class NumeDuplicat {
	
	static String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
			"Bogdan", "Oana", "Ion"};

	
	
	
	public static void main(String[] args) {

		for (int i = 0; i < myStringArray.length;i++) {
			
			String elementulI = myStringArray[i];
			for(int j=i+1;j<myStringArray.length;j++) {
				
				String elementulJ = myStringArray[j];
				
				if (elementulI.equals(elementulJ)){
					
				
					
				System.out.println("Nume Duplicat " + elementulI );
				break;
				}
				
				
			}
			
		}
		
		
		

	}

}
