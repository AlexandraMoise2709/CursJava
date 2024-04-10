package Curs10;

public class TestWildAnimal {

	public static void main(String[] args) {

//		Lion leu = new Lion();
//		leu.makeSound();//metodata suprascris
//		leu.eatMeat();//metodata proprie a lui lion
//		leu.whereItLives();//metoda mostenita din clasa parinte
		
		
//		System.out.println("--------------------------------");
//		
//		Deer deer = new Deer();
//		deer.makeSound();
//		deer.eatGrass();
//		deer.whereItLives();	
//		
		
		
//		
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WildAnimal leu = new Lion();
		leu.makeSound();
		((Lion) leu).eatMeat();
		leu.whereItLives();
		
		leu = new Deer();
		((Deer) leu).eatGrass();
		leu.whereItLives();
		

	}
	
	public static void feedAnimal(WildAnimal animal) {
		
		if(animal instanceof Lion) {
			
			
			
			System.out.println("You are getting steak!");
		}
		else if(animal instanceof Deer) {
			
			System.out.println("You are getting parsely!");
			
		
		}
		
		
		
	}

}
