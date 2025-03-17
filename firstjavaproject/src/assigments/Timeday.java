package assigments;

import java.util.Scanner;

public class Timeday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Time: (in Hrs)");
		float time = sc.nextFloat();
		if(time<=24 && time>=0) {
			if(time<12 && time>=0) {
				System.out.println("Good Morning !");
			}
			else if(time<17 && time>=12) {
				System.out.println("Good Afternoon !");
			}
			else {
				System.out.println("Good Evening !");
			}
		}
		else {
		System.out.println("Good Afternoon !");
		}
		sc.close();
	}

}
