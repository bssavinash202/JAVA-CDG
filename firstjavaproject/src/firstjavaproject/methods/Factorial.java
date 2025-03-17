package firstjavaproject.methods;

public class Factorial {
	
	public static int factorial(int n) {
		
		/*
		 * int fact = 1; for(int i=1;i<=num;i++) { fact*=i; }
		 */
		if(n==0||n==1) {
			return 1;
		}
		int fact = n*factorial(n-1);
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
}
