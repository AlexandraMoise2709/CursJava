package Curs2;
/*
 * Conventie nameing Java;
 * numele claselor este UpperCamelCase;
 * numele metode si variablie este lowerCamelCase;
 * 
 * nume_tester--snake case, folosit in phyton
 */
public class Tester {
	
	//variabile
	private String numeTester;//String default null
	private int varstaTester;//numeric default 0
	
	//metoda
	public void afiseazaDetaliiTester() {
		
		System.out.println("Numele testerului este: " + numeTester);
		System.out.println("Varsta testerului este: " + varstaTester);
		System.out.println("Lungimea numelui este: " + numeTester.length());


	}
	//constructor default  
	
	//public Tester() {};
	
	//Tester tester1 = new Tester()
	public Tester(String numeTester, int varstaTester) {
		
		this.numeTester= numeTester;
		this.varstaTester = varstaTester;
		
	};

}
