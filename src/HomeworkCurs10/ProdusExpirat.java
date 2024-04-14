package HomeworkCurs10;

public class ProdusExpirat extends Product{
	
	int nrProduseExpirate;
	
	@Override
	public void calculCantitate(int nrProduseExpirate) {
		
		cantitate -=nrProduseExpirate;
		System.out.println("Cantitatea ramasa este: "  + cantitate );	
		
		
	}
	

}
