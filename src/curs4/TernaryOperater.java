package curs4;

public class TernaryOperater {

	public static void main(String[] args) {
		
		
		int nr1 =5;
		int nr2=8;
		
		if(nr1>nr2) {
			System.out.println("Nr1 este mai mare");			
			
		}else {
			
			System.out.println("Nr2 este mai mare");
			
			
		}
		
		//operatorul ternar ?:
		
		//conditie ? true: expresie false:
		
		String result = (nr1>nr2) ? "nr1 este mai mare":"nr2 este mai mare";
				System.out.println(result);

				
				int x = nr1>nr2 ? nr1:nr2 ;
				
				int y = nr1>nr2 ? nr1+nr2: nr2/nr1;
	}

}
