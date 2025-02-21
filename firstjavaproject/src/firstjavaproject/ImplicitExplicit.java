package firstjavaproject;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implicit casting
			int a =10;
			double b = a;
			System.out.println(b);
		// explicit casting
				double d = 123.4556;
				int e = (int)d; //double ==> int
				System.out.println(e); //123
	}

}
