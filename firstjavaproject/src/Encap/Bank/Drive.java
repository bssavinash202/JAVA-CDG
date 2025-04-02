package Encap.Bank;

public class Drive {
	
		public static void main(String[] args) {
			System.out.println("=======Savings Account=============");
			SavingsAccount b = new SavingsAccount("SAVACC111",9000,5);
			System.out.println("Account number: "+b.getAccountNumber());
			b.getBalance();
			System.out.println("Interest Rate: "+b.getInterestRate()+"%");
			System.out.println("Interest Amount: "+b.calculateInterest()+" per year");
			
			System.out.println("\n");
			
			System.out.println("========Current Account========");
			CurrentAccount c = new CurrentAccount("CURACC111",1000,5);
			System.out.println("Account number: "+c.getAccountNumber());
			c.getBalance();
			System.out.println("Interest Rate: "+c.getInterestRate()+"%");
			System.out.println("Interest Amount: "+c.calculateInterest()+" No interest Rate");
	}
}
