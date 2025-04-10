package Bank;

public class BankAccount {
	private int balance = 100;

	public void deposit(int amount) {
		int temp = balance;
		System.out.println("Reading Balance: " + temp);
		temp += amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = temp;
		System.out.println("Updated Balance: " + balance);
	}

	public void withDraw(int amount) {
		int temp = balance;
		System.out.println("Reading Balance: " + temp);
		temp -= amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = temp;
		System.out.println("Updated Balance: " + balance);
	}
}
