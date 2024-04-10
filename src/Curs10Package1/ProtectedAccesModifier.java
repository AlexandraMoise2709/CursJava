package Curs10Package1;

public class ProtectedAccesModifier {
/*Scpul lui in acelasi pachet si subclasedin alte pachete
 * clasele nu pot fi declarate ca protected
 * Aceasi clasa :yes
 * alta clasa acelasi pachet:yes
 * sub clasa acelasi pacekt:da
 * Alta clasa din alt pachekt:nu
 * subclasa din alt packet:yes
 * 
 */
	
	
	protected String mesaj = "Protected Access modifier";
	
	protected void printMesaj() {
		
		
		System.out.println(mesaj);
	}
}
