package assigments2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you Number");
		int n = sc.nextInt();
		int ogNum = n;
		int rev = 0;
		while(n!=0) {
			int rem = n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==ogNum) {
			System.out.println(ogNum+" is a Palindrome");
		}else {
			System.out.println(ogNum+" is not a Palindrome");
		}
		sc.close();
	}
}
