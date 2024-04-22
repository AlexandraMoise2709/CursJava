package HomeworkCurs11;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) throws InsufficientFundsException {
		
		double suma;
		Customer customer =  new Customer("Alexandra", "adresa","shaah");	
		
		
		
			
		System.out.println("Hi " + customer.getName());
		
		System.out.println("Please insert the amount that you wish to widraw");
		Scanner scan = new Scanner(System.in);
		
		;
		//int accountNumber, double balance, Customer accountOwner
		SavingsAccount savingsAccount = new SavingsAccount(0, 0, customer);
		savingsAccount.setBalance(scan.nextDouble());
		
		System.out.println();
		suma = scan.nextDouble(); 
		savingsAccount.withdraw(suma);
		
		
		
	
		
		
	}

}
