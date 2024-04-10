package Curs10;

public class ExceptionExample2 {

	public static void main(String[] args) {


		try {
			
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e){
			System.out.println("Excepion occured");
			System.out.println(3/0);
			
		}finally {
			System.out.println("finally occured");
			
			
		}
		System.out.println("COde after");
		
		
		
		
	}

}
