package Curs10;

public class ExceptionExample {

	public static void main(String[] args) {

		String [] week = {"L","M","Mi","J","V","S","D"};
		
		try {
		System.out.println(week[7]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("A aparut o eroare");
			e.printStackTrace();
		}
		
		System.out.println("Some other code");
		
		
		
	}

}
