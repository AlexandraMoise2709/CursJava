package Curs2;

public class ExempluVariabila {
	//variabila de instanta
	int age = 35;
	
	final int varsta = 30;
	
	
	public void mesaj() {
		String nume = "Ion";		
		String mesaj;
		mesaj="Salut";		
		age = 45;
		
	}
	
	public static void main(String[] args) {	
		
		//System.out.println(age);
		
		ExempluVariabila obj = new ExempluVariabila();
		System.out.println(obj.age);
	}

}
