package Curs2;

public class TestRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room baie = new Room (2, 4);
		System.out.println(baie.calculArie());
		System.out.println(baie.calculPerimetru());
		
		Room dormitor = new Room (8, 6);
		System.out.println(dormitor.calculArie());
		System.out.println(dormitor.calculPerimetru());
		System.out.println(dormitor.afiseazaCuloareDreptunghi());//a folosit valoare din clasa a atributului culoare
		
		Room homework = new Room (9, 5,"Mov");
		System.out.println(homework.calculArie());
		System.out.println(homework.calculPerimetru());
		System.out.println(homework.afiseazaCuloareDreptunghi());//a suprascris valoare din clasa pt culoare
	}

}
