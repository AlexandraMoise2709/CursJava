package HomeworkCurs10;

public class ProdusDefect extends Product {
	
	int nrProduseDefecte;
	
	
	@Override
	public void calculCantitate(int nrProduseDefecte) {
		
		cantitate -=nrProduseDefecte;
		
		System.out.println("Cantitatea fara produsele defecte este: "  + cantitate );
		
	};
	
	

}
