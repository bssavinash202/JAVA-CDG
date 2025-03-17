package assigment3;

public class OddDigits {

	public static void main(String[] args) {
		int num = 342156;
		int odd = 0;
		while(num!=0) {
			int digit = num%10;
			if(digit%2!=0) {
				odd=digit;
				System.out.print(odd+" ");
			}
			num/=10;
		}
	}

}
