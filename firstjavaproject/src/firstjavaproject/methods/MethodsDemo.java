package firstjavaproject.methods;

public class MethodsDemo {
	
	public void sum(int num1, int num2) {
		int sum =  num1+num2;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		MethodsDemo d = new MethodsDemo();
		d.sum(10,20);
		d.sum(200,20);
	}
	
}
