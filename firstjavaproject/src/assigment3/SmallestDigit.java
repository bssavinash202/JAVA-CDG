package assigment3;

public class SmallestDigit {

	public static void main(String[] args) {
		int num = 8786;
		int minDigit=num;
		while(num!=0) {
			int digit = num%10;
			if(digit<minDigit) {
				minDigit=digit;
			}
			num=num/10;
		}
		System.out.println(minDigit);
		

	}

}
