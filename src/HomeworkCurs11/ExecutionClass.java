package HomeworkCurs11;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) throws InsufficientFundsException {
		
		double suma;
		Customer accountOwner =  new Customer("Alexandra", "adresa","shaah");
		SavingsAccount savingsAccount = new SavingsAccount(1234, 100, accountOwner);
		
		
		
		System.out.println("Hi " + accountOwner.getName());
		
		System.out.println("Please insert the amount that you wish to widraw");
		Scanner scan = new Scanner(System.in);
		suma = scan.nextDouble();

		
		//int accountNumber, double balance, Customer accountOwner
		
		savingsAccount.withdraw(suma);	
		
		
	
		
		
	}

}
