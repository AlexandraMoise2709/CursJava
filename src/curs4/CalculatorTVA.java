package curs4;

/*
 * 
 * scrie un program de tip calculator care calculeaza TVA pt o suma
 * 
 * TVA-ul poate avea multiple valori, o sa il atribuim cand cream obiectul
 * 
 * afisam calculul pt valori diferite
 * afisam nr total de calcule TVa pe care le facem
 */

public class CalculatorTVA {
	
	private double tvaDouble;
	private static int nrCalculTotal;
	public CalculatorTVA(int tva) {
		
		this.tvaDouble = tva/100.0;
		
	}
	
	public double adunaTVA(double suma) {
		
		nrCalculTotal++;//nrCalculTotal=nrCalculTotal+1 
		return suma* (1 + tvaDouble);
		
	}
		public static int getNrCalculTotal() {
			
			return nrCalculTotal;
		}
	

}
