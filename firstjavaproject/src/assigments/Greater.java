package assigments;

import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Your Second Number: ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is Greatest");
		}
		else {
			System.out.println(num2+" is Greatest");
		}
		sc.close();
	}

}
