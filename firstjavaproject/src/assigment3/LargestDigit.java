package assigment3;

public class LargestDigit {
	public static void main(String[] args) {
		int num=541;
		int maxDigit=0;
		while(num!=0) {
			int digit = num%10;
			if(digit>maxDigit) {//1>0//4>1//5>1
				maxDigit=digit;//1//4//5
			}
			num=num/10;
		}
		System.out.println(maxDigit);
	}
}
