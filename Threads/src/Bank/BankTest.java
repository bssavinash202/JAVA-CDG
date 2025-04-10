package Bank;

public class BankTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		WithDrawThread withdraw = new WithDrawThread(account);

		DepositThread deposit = new DepositThread(account);
		deposit.start();
		try {
			deposit.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withdraw.start();
		try {
			withdraw.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
