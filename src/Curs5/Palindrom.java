package Curs5;

public class Palindrom {

	public static void main(String[] args) {
	
		String cuvant = "radar";
		String cuvantIntors = "";
		
		/*
		 * cuvntul = radar -- >radar.lenght() = 5;
		 * 
		 * cuvantIntors = "";
		 * cuvantIntors = cuvantIntors + cuvant.charAt(4);
		 * 
		 * ""= "" + r
		 * 
		 * cuvantIntors = cuvantIntors + cuvant.charAt(3);
		 * cuvantIntors = cuvantIntors 
		 * 
		 * 
		 */
		
		
		for(int i = cuvant.length()-1; i>=0;i--) {
			
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			
			}
		
		if (cuvant.equals(cuvantIntors)) {
			
			System.out.println("Este palindrom");
		}else {
			System.out.println("Nu Este palindrom");
			
		}
		
	}

}
