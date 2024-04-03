package Curs8;

public class TwoDimArray {
	
	

	public static void main(String[] args) {
		

		String [][] textArray = {{"Brasov", "Iasi","Cluj"}, {"Paris","Viena","Genova"}};
	
		
		for(int i=0;i<textArray.length;i++) {
			
			System.out.println("Row");
			for(int j=0; j<textArray[i].length ;j++) {
				
				System.out.println("Column");
			}
		}
			
			System.out.println(textArray[i][j]);

		}

}

