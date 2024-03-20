package curs4;

public class TestCalculatorTVA {

	public static void main(String[] args) {

		CalculatorTVA calc1 = new CalculatorTVA(5);
		CalculatorTVA calc2 = new CalculatorTVA(9);
		CalculatorTVA calc3 = new CalculatorTVA(19);

		double rezult1 = calc1.adunaTVA(170.0);
		System.out.println("Rezultat adunare 1:+ "+ rezult1);
		
		double rezult2 = calc2.adunaTVA(30.0);
		System.out.println("Rezultat adunare 1:+ "+ rezult2);
		
		
		double rezult3 = calc3.adunaTVA(45.0);
		System.out.println("Rezultat adunare 1:+ "+ rezult3);

		
		System.out.println("nr total de calcule:"+ CalculatorTVA.getNrCalculTotal());
	}
	


}
