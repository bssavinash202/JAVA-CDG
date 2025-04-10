package Threadspackage;

//Step 1: thread created by implementation using Runnable interface
public class MyTask implements Runnable{
	
	//Step 2: overriding run()
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
