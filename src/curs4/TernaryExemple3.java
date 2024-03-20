package curs4;

/*
 * 
 * verifica daca cosul este gol si printa daca e
 * verific daca total cos este peste 100
 * verific daca nr de produse este mai mare ca5 si totual cost este mai mare ca 120
 * nr de produse este maresi total cos este mare
 * nr de produse este mic si totualul este ai mic
 */

public class TernaryExemple3 {

	public static void main(String[] args) {
		int totalCostCumparatri =120;
		
		int numarProduseInCos=3;
		
		String mesaj =  (totalCostCumparatri==0) ? "Cosul este gol" : "cosul nu este gol";
			System.out.println(mesaj);
			mesaj = totalCostCumparatri>100 ? "Total Cumparaturi peste 100" : "Total sub 100";
			System.out.println(mesaj);
			
	}

}
