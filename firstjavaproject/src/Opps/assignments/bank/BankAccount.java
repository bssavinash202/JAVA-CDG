package Opps.assignments.bank;

public class BankAccount {
	private String accNum;
	private double balance;
	private String name;
	
	BankAccount(String accNum,double balance,String name){
		this.accNum=accNum;
		if(balance>0) {
			this.balance=balance;
		}else {
			this.balance=0;
		}
	
		this.name=name;
	}
	public String getAccNum() {
		return accNum;
	}
	public double getBal() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public  void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Amount deposited...");
		}else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(int amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Amount withdrawn.....");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
