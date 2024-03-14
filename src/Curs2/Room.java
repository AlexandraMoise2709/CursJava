package Curs2;

public class Room {
//double = nr cu zecimale
//short, long, int	
	
	//variable
	private double lungime;
	private double latime;
	private String culoare = "Alb";
	
	//constructor cu parametri
/*	public Room(double lungime, double latime) {
		this.lungime= lungime;
		this.latime = latime;	
		
	}
*/	
	
	
	public Room (double lungime, double latime) {
		this.lungime= lungime;
		this.latime = latime;	
				
	}
	
	public Room (double lungime, double latime, String culoare) {
		this.lungime= lungime;
		this.latime = latime;	
		this.culoare = culoare;		
	}
	
	
	
	public double calculArie() {
		//double arieRoom = latime * lungime;		
		//return arieRoom;
		return lungime * latime;
	
	}		

		public double calculPerimetru () {
			return 2 * (lungime + latime);
		}
		
		public String afiseazaCuloareDreptunghi() {
			return culoare;
			
		}
	
	
}
