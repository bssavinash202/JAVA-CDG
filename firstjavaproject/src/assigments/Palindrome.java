package assigments;

public class Palindrome {

	public static void main(String[] args) {
		int num = 1331;
		int rem=0;
		int rev=0;
		int OgNum = num;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		if(OgNum==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a Palindrome");
		}

	}

}
