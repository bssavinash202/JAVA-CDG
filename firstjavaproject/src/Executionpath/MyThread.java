package Executionpath;

public class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My Thread: "+i);
		try {
			Thread.sleep(500);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	}
	
}
