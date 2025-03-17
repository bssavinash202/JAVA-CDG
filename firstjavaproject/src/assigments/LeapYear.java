package assigments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+" is a Leap year");
		}else {
			System.out.println(year+" is not a Leap year");
		}
		sc.close();
	}

}
