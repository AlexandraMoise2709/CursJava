package Curs10Package1;

 
class DefaultAccessModifier {
	
	
	/*
	 * default inseamna atunci cand nu specificam nimic
	 * Scop lui este limitat la pachetul in care se afla
	 * 
	 * Same class: yes
	 * alta clasa in acelasi packet: yes
	 * subclasa sau clasa copil in acelasi packet: yes
	 * alta clasa in alt pachet:no
	 * sub clasa sau clasa copil in alt pachekt: no
	 * 
	 * 
	 */

	String mesaj = "Default acces Modifier";
	
	void printMesaj() {
		
		System.out.println(mesaj);
		
	}
	

	
}
