package Curs5;

import java.util.Scanner;

/*
 * 
 * un  program care cere un text de la tastatura, cautam in text litera b, daca o gasim printam litera b exista in text,
 * daca nu o gasim printam ca litera b nu exista in text
 * rez1: gasesc litera b, printez si ies
 * rezolvarea 2: numara de cate ori apare litera b
 */
public class LetterSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = scan.next().toLowerCase();
		
		System.out.println(text.length());
		
		//masina -- lungimea este 6
		//012345
		//masina -- >string
		//masina.charAt(3)==i
		boolean amGasitLiteraB= false;
		int nrAparitii = 0;
		for (int i=0;i < text.length(); i++) {
			
			if (text.charAt(i) == 'b' || text.charAt(i) == 'B')
			{
				//amGasitLiteraB =true;
				//break;
				nrAparitii++;
			};		
			
			
			}
//		if(amGasitLiteraB) {
//		System.out.println("am gasit litera b");
//		}else {
//			System.out.println("NU am gasit litera b");
//		}
		

		//String result = amGasitLiteraB ? "Am gasit litera b": "Nu am gasit litera b";
		
		//System.out.println(result);
		
		System.out.println("Nr aparitii litera B:" + nrAparitii);
		
	}

}
