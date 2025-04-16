package Thread.Num;

public class NumberPrinter implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new NumberPrinter());
		Thread t2 = new Thread(new NumberPrinter());
		System.out.println("Thread 1");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nThread 2");
		t2.start();

	}

}
