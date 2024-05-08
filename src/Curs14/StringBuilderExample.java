package Curs14;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString  ("masina");
		replaceFromStrng("Salut Popescu",6, 13, "Oana");
		//				  0123456789101112
		
		
		deleteFreomString("Salut Ion Popescu", 6, 10);
		//				   0123456789
		
		insertIntoString("Tele", 4,"vizor" );
		insertIntoString("Tele","Tele".length(), "ham"  );

	}
	public static void reverseString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
		
		
	}
	
	public static void replaceFromStrng(String text, int indexStart, int indexEnd, String textToReplace) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.replace(indexStart, indexEnd, textToReplace);
		System.out.println(sb);
		
	}
	public static void deleteFreomString(String text, int startIndex, int endIndex) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
		
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
		
		
	}
	
	

}
