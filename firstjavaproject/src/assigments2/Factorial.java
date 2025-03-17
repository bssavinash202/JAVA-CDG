package assigments2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you Number");
		int n = sc.nextInt();
		int fact =1;
		for(int i=n;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
		sc.close();
	}

}
