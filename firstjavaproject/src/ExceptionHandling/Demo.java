package ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
	
//		  int val1=100; int val2 = 0; 
//		  System.out.println("main method executing...");
//		  try { 
//			  int q=val1/val2;//abnormal situation
//			  System.out.println(q); 
//		   } 
//		  catch(Exception err)
//		  { 
//			  err.printStackTrace();
//			  System.out.println(err); 
//		  } 
//		   System.out.println("After division");
//		 
		int a[] = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println("int array");
		try {
			a[3]=40;//abnormal situation
		}catch(Exception err) {
			err.printStackTrace();
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println("complete");
	}
}
