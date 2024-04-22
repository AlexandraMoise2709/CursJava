package HomeworkCurs11;

/*
 * Clasa SavingsAccount care mosteneste Account
Seteaza in constructor accountOwner, balance si accountNumber
Suprascrie metoda withdraw unde implementeaza:
- daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta,
arunca InsuficientFundsException
- altfel scade suma ce urmeaza a fi retrasa din balanta
 * 
 * 
 * 
 */
public class SavingsAccount extends Account {
	

	
	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
		
	}



	public static void withdraw(Double suma) throws InsufficientFundsException {
		
		if(suma < balance) {	
			balance -=suma;
		}else {
			throw new InsufficientFundsException("Insuficient funds for transaction");
		} 
			
			
	}

}
