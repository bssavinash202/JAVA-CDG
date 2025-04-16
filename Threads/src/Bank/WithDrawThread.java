package Bank;

public class WithDrawThread extends Thread {
	BankAccount account;

	WithDrawThread(BankAccount account) {
		this.account = account;
	}

	public void run() {
		account.withDraw(30);
	}
}
