package assigment3;

public class SpyNumber {

	public static void main(String[] args) {
		int num = 1124;
		int temp =num;
		int product = 1;
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			product*=digit;
			sum+=digit;
			num/=10;
		}
		System.out.println("Sum of each digit: "+sum);
		System.out.println("Product of each digit: "+product);
		if(sum==product) {
			System.out.println(temp+" is a SPY Number");
		}
		else {
			System.out.println(temp+" is not a Spy Number");
		}
	}

}
