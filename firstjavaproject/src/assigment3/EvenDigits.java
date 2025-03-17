package assigment3;

public class EvenDigits {

	public static void main(String[] args) {
		int num = 34216;
		int even = 0;
		while(num!=0) {
			int digit = num%10;
			if(digit%2==0) {
				even=digit;
				System.out.print(even+" ");
			}
			num/=10;
		}

	}

}
