package Executionpath;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		//set names to threads
		MyThread1 t1 = new MyThread1();
		t1.setName("Lowest Priority Thread");
		
		MyThread1 t2 = new MyThread1();
		t2.setName("Normal Priority Thread");
		
		MyThread1 t3 = new MyThread1();
		t3.setName("Highest Priority Thread");
		
		//set priorities to thread
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		//start the threads
		t1.start();
		t2.start();
		t3.start();
	}
}
