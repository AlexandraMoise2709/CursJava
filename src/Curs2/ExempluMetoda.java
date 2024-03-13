package Curs2;

public class ExempluMetoda {

	public static void main(String[] args) {
		// main + ctrl +space
		ExempluMetoda obj = ExempluMetoda();
		
		int latime = 5;
		int lungime = 3;
	//	int arieRoom = latime * lungime; 
		//System.out.println("Arie camera: " + arieRoom);
		System.out.println("ArieCamera: " + obj.calculArie(latime, lungime));
		
		int latime2 = 4; 
		int lungime2 = 6;
		
//		int arieRoom2 = latime2 * lungime2; 
//		System.out.println("Arie camera2: " + arieRoom2);
		System.out.println("ArieCamera: " + obj.calculArie(latime2, lungime2));
		System.out.println("PerimetruCamera: " + obj.perimetru);


	}
	
	private static ExempluMetoda ExempluMetoda() {
		// TODO Auto-generated method stub
		return null;
	}

	public int calculArie(int latime, int lungime) {
		int arieRoom = latime * lungime;
		
		return arieRoom;
		
	}
		
		int perimetru;
		public void calculPerimetru (int latime, int lungime) {
			
			perimetru = 2 * (latime+ lungime);
		}	
		
	

}
