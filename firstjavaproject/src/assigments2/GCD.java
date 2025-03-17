package assigments2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you Number1");
		int num1 = sc.nextInt();
		System.out.println("enter you Number2");
		int num2 = sc.nextInt();
		
		while(num2!=0) {
			int temp = num2;
			num2=num1%num2;
			num1=temp;
		}
		System.out.println("GCD is: " + num1);
        sc.close();
	}

}
