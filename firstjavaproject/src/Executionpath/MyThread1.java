package Executionpath;

public class MyThread1 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName()+" - Priority "+getPriority()+" Count: "+i);
		}
	}
}
