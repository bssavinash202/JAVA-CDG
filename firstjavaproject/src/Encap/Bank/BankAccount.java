package Encap.Bank;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private	int interestRate;
	

	public BankAccount(String accountNumber, double balance, int interestRate) {
		setAccountNumber(accountNumber);
		setBalance(balance);
		setInterestRate(interestRate);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void getBalance() 
	{    
		if(balance>0) {
			
			System.out.println("Balance: "+balance);
		}else {
			System.out.println("Balance: Cannot be zero");
			
		}
	}

	public void setBalance(double balance) {
		if(balance>0) {
			this.balance = balance;
		}else {
			this.balance=0;
			
		}
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*interestRate/100;
	}
	
}
