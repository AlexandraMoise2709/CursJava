package HomeworkCurs4;

public class HomeworkEx1 {

	public static void main(String[] args) {
		int factura = 50;
		
		double discount= (factura<100)? factura*0.05: factura * 0.1;
		System.out.println("Discountul este " + discount + "%");

	}

}
