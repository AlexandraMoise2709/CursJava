package Curs3;

public class StaticCsNonStatic {

	String prenume;
	static String nume;
	
	public static void main(String[] args) {

		StaticCsNonStatic obiect = new StaticVsNonStatic();
		obiect.prenume = "Oana";
		//prenume = "Ioana";
		StaticVsNonStatic.nume = "Carmen";
		
		StaticCsNonStatic person1 =  new StaticVsNonStatic();
		person1.nume = "ion";
		person1.prenume = "popescu";
		
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		
		StaticVsNpackage curs3;

public class StaticCsNonStatic {

	String prenume;
	static String nume;
	
	public static void main(String[] args) {

		StaticCsNonStatic obiect = new StaticCsNonStatic ();
		obiect.prenume = "Oana";
		//prenume = "Ioana";
		StaticCsNonStatic.nume = "Carmen";
		
		StaticCsNonStatic person1 =  new StaticVsNonStatic();
		person1.nume = "ion";
		person1.prenume = "popescu";
		
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		
		StaticCsNonStatic person2 =  new StaticVsNonStatic();
		person2.nume = "ionescu";
		person2.prenume = "george";
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		System.out.println("Person2 " + person2.nume + " " + person2.prenume );

		StaticCsNonStatic person3 =  new StaticVsNonStatic();
		person3.nume = "Necunoscut";
		person3.prenume = "Maria";
		
		System.out.println("Person3 " + person3.nume + " " + person3.prenume );

		System.out.println("------------------------------------------------------");
		
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		System.out.println("Person2 " + person2.nume + " " + person2.prenume );
		System.out.println("Person3 " + person3.nume + " " + person3.prenume );

	}

}onStatic person2 =  new StaticVsNonStatic();
		person2.nume = "ionescu";
		person2.prenume = "george";
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		System.out.println("Person2 " + person2.nume + " " + person2.prenume );

		StaticVsNonStatic person3 =  new StaticVsNonStatic();
		person3.nume = "Necunoscut";
		person3.prenume = "Maria";
		
		System.out.println("Person3 " + person3.nume + " " + person3.prenume );

		System.out.println("------------------------------------------------------");
		
		System.out.println("Person1 " + person1.nume + " " + person1.prenume );
		System.out.println("Person2 " + person2.nume + " " + person2.prenume );
		System.out.println("Person3 " + person3.nume + " " + person3.prenume );

	}

}