package Curs11;

public class Laptop extends Product {

	
	private int buyPrice;
	private int tva;
	private int adaosCom;
	
	public Laptop(int buyPrice, int tva,int adaosCom) {
		
		this.buyPrice = adaosCom;
		this.tva = tva;
		this.adaosCom = adaosCom;
	}
	
	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyPrice+ tva  +adaosCom;
	}

}
