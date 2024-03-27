package curs6;

import java.util.Scanner;

public class ForVersusWhile {

	
	/*un program care cere numere incontinuu de la user, le inmuteste cu 10 si le printeaza,
	 *  face asta pana cand userul introduce 0
	 *  cand userul a introdus 0, iesim in bucla
	 * 
	 * 
	 */
	
	
	static Scanner scanner = new Scanner(System.in);
	static int numar;
	
	public static void main(String[] args) {
		rezolvareCuwhile();

	}
	
//	public static void rezolareCuFOr(){
//		System.out.println("Introdu un numar");
//		
//		for (numar = scanner.nextInt();numar!=0;numar=scanner.nextInt()) {
//			
//			numar= numar*10;
//			System.out.println(numar);
//			System.out.println("INTRODU UN NUMAR:");
//		}
//		
//					
//	}
//		public static void rezolvareCuFor2() {
//			
//			for(;;) {
//				
//				numar = scanner.nextInt();
//				if(numar==0) {
//					
//					break;
//					
//				}
//				numar= numar*10;
//				System.out.println(numar);
//				System.out.println("INTRODU UN NUMAR:");
//				
//				
//				
//			}
//			
//			
//		}
		
		public static void rezolvareCuwhile() {
			
			
			System.out.println("INTRODU UN NUMAR:");
			
			numar = scanner.nextInt();
			
			while(numar!=0) {
				
				numar= numar*10;
				System.out.println(numar);
				System.out.println("INTRODU UN NUMAR:");
				numar = scanner.nextInt();
				
				
			}
			
			
			
			
		}

}
