package Threadspackage;

public class RunnableExample {

	public static void main(String[] args) {
		//Step 3: Created object of MyTask
		//MyTask task = new MyTask();
		
		//step 4: pass the object to thread constructor
		
		//Thread thread = new Thread(task);
		
		//or
		
		Thread thread = new Thread(new MyTask());
		
		thread.start();
	}
}
