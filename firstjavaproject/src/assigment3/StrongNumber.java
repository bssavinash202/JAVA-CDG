package assigment3;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		
		int strong = 0;
		while(num!=0) {
			int fact = 1;
			int digit = num%10;
			for(int i=digit;i>=1;i--) {
				fact*=i;
			}
			strong+=fact;
			num/=10;
		}
		if(temp==strong) {
			System.out.println(temp+" is a strong");
		}else System.out.println(temp+" not a strong");
	}
}
