package Curs5;

/*
 * facem un program care verifica daca un string este pangram
 * adica daca foloseste toate literele alfabetului
 * 
 * dupa verificare printam daca este pangram sau nu
 */
public class Pangram {

	
	public static void main(String[] args) {
		
//		char caracter = 'a';//unicode 97
//		caracter++;//incrementeaza 97 + 1
//		
//		System.out.println();//unicode 98 care este 'b'
//		
		String text = "The quick brown fo jumps over the lazy dog";
		
		
		for(char ch ='a'; ch<='z' ; ch++) {
			
			if(text.indexOf(ch)== -1) {				
				System.out.println("Nu este pangram");
				break;
			}
			
			
		}
		

	}

}
