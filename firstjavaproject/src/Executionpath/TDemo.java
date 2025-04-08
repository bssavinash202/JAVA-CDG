package Executionpath;

public class TDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		//start() method of thread class will start the thread
		// starting the thread
		t.start();//MyThread is started
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted");
			}
		}
	}
}
