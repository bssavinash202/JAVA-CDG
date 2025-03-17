package assigments;

import java.util.Scanner;

public class GreatThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter your number 3: ");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is greatest");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+ " is greatest");
		}
		else {
			System.out.println(num3+ " is greatest");
		}
		sc.close();
	}

}
