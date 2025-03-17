package assigments;

import java.util.Scanner;

public class Divis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = sc.nextInt();
		if(number%5==0 && number%7==0) {
			System.out.println(number+" is divisble by both 5 and 7");
		}
		else {
			System.out.println(number+" is not divisble by both 5 and 7");

		}
		sc.close();
	}

}
