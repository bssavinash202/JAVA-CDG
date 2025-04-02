package Encap.Bank;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(String accountNumber, double balance, int interestRate) {
		super(accountNumber, balance, interestRate);
		
	}
	public double calculateInterest() {
		return 0;
	}


	
}


