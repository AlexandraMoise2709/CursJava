package HomeworkCurs10;

import java.util.Scanner;

public class ClasaDeTest {

	public static void main(String[] args) {
		
		
		Scanner scan =  new Scanner(System.in);
		Product product = new Product();
		
		
		ProdusDefect pDefect = new ProdusDefect();
		System.out.println("Te rog sa introduci cantitatea totala");
		pDefect.cantitate=scan.nextInt();
		System.out.println("Te rog sa introduci numarul de produse defecte");
		pDefect.nrProduseDefecte = scan.nextInt();
		System.out.println("Te rog sa introduci numarul de produse expirate");
		ProdusExpirat pExpirat = new ProdusExpirat();
		
		pExpirat.nrProduseExpirate = scan.nextInt();
		pExpirat.cantitate = pDefect.cantitate;
		
		pDefect.calculCantitate(pDefect.nrProduseDefecte);
		
		pExpirat.cantitate = pDefect.cantitate;
		pExpirat.calculCantitate(pExpirat.nrProduseExpirate);
		
		
	}

}
