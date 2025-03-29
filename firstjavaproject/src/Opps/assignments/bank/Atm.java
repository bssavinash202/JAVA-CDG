package Opps.assignments.bank;
import java.util.*;
public class Atm {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("101201",0,"Avinash");
		
		System.out.println("Account holder name: "+account.getName());
		System.out.println("Bank Account Number: "+account.getAccNum());
//		System.out.println("Account holder Balance: "+account.getBal());
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. withdraw");
			System.out.println("3. viewBalnce");
			System.out.println("4. Exit");
			System.out.println("=======================");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter amount: ");
					int am1 = sc.nextInt();
					account.deposit(am1);
					break;
			case 2: System.out.println("Enter amount: ");
					int am2 = sc.nextInt();
					account.withdraw(am2);
					break;
			case 3: System.out.println("Account holder Balance: "+account.getBal()); break;
			case 4: System.exit(0); break;
			default: System.out.println("Invalid choice");
			}
		}
		
	}
}
