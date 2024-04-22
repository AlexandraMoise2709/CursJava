package HomeworkCurs11;

/*
 * Clasa SavingsAccount care mosteneste Account
Seteaza in constructor accountOwner, balance si accountNumber
Suprascrie metoda withdraw unde implementeaza:
- daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta,
arunca InsuficientFundsException
- altfel scade suma ce urmeaza a fi retrasa din balanta
Daca userul nu are suficienti bani va arunca o exceptie si va printa : “The
amount you entered is greater than the available balance :” + balance si
”Thank you for using our ATM” si printam si stackTrace-ul exceptiei
 * 
 * 
 * 
 */
public class SavingsAccount extends Account {
	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
        super(accountNumber, balance, accountOwner);
    }

    @Override
    public void withdraw(double suma) {
        try {
            if (suma > balance) {
                throw new InsufficientFundsException("The amount you entered is greater than the available balance: " + balance);
            } else {
                balance -= suma;
                System.out.println("Please pick your money!");
                System.out.println("Thank you for using our ATM");
                System.out.println("Your new balance is " + balance);
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Thank you for using our ATM");
            e.printStackTrace();
        }
    }
    
}
