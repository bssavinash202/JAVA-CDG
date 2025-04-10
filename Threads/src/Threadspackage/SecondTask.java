package Threadspackage;

public class SecondTask implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Second Task: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
