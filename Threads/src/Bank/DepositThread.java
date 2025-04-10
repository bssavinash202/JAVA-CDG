package Bank;

public class DepositThread extends Thread {
	BankAccount account;

	DepositThread(BankAccount account) {
		this.account = account;
	}

	public void run() {
		account.deposit(80);
	}
}
