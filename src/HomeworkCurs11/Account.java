package HomeworkCurs11;



public class Account {

	private int accountNumber ;
	public double balance;
	public Customer accountOwner;
	
	
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
		
	}




	public void withdraw(double suma) throws InsufficientFundsException {
		
		if(suma <=0) {
			
			
		}	else {
			throw new InsufficientFundsException("Insuficient funds for transaction");
		
	} 
	
}
	



	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Customer getAccountOwner() {
		return accountOwner;
	}


	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}


	
}
