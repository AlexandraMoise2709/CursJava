
package curs7;

import java.util.Arrays;

public class ArrayExemple {

	public static void main(String[] args) {

		String[] textArray = new String[4];
	//  String[] textArray = {null, null, null, null};	
	//  index                   0     1     2    3
		System.out.println(textArray[0]);
		textArray[0] = "Acesta ";
	//  String[] textArray = {"Acesta ", null, null, null};	
	//  index                   0          1     2    3	
		System.out.println(textArray[0]);
		textArray[1] = " este ";
	//  String[] textArray = {"Acesta ", "este", null, null};	
	//  index                   0          1     2    3		
		textArray[2] = " un ";
		textArray[3] = " array ";
	//  String[] textArray = {"Acesta ", "este", "un", "array"};
		
		System.out.println(textArray);
		System.out.println(Arrays.toString(textArray));
		
		System.out.println("-------------------------------------------");
		
		for(int i = 0; i<textArray.length; i++) {
			
			System.out.print(textArray[i]);
		}

		System.out.println("\n-------------------------------------------");

		for(String element : textArray) {
			
			System.out.print(element);
			
		}
		
		
	}

}

