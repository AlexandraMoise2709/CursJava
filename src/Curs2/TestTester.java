package Curs2;
//constuctorul este o metodata speciala care te ajuta sa instantiezi clasa
public class TestTester {

	public static void main(String[] args) {
/*		Tester tester1 = new Tester();
		tester1.numeTester="Oana";
		tester1.varstaTester=25;
		tester1.afiseazaDetaliiTester();
		
		
		*/

		
		Tester tester2 = new Tester("Ioana",35);
	//	tester2.numeTester="Ioana";
	//	tester2.varstaTester=35;
		tester2.afiseazaDetaliiTester();
		
		Tester tester3 = new Tester("Monica", 34);
		tester3.afiseazaDetaliiTester();
	}

}
