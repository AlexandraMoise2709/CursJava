package Curs12;

/*
 * facem un program care cauta pe baza unui cod postal si printeza orasul
 * avem o clasa care inca de a initializare obiectului initializeaza o serie de coduri postale si orase
 * avem o functionalitate care cauta pe baza codului si printeaza orasul:
 * daca codul postal nu exista arunc o exeptie :Postal code Exeption
 * si intreb din nou utilizatorul pana primesc cod corect 
 */

public class SearchPostalcode {

	public static void main(String[] args) {
	
		CoduriPostale cp = new CoduriPostale();
		
		System.out.println(cp.map);
	}

}
