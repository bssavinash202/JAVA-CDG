package Threadspackage;

public class DemoTask {
	public static void main(String[] args) {
		
		FirstTask first = new FirstTask();
		SecondTask second = new SecondTask();
		
		Thread thread1 = new Thread(first);
		Thread thread2 = new Thread(second);
		
		//start the first thread.
		thread1.start();
//		using join method
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
