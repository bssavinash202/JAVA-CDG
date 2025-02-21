package firstjavaproject;

import java.util.Scanner;
public class PersonalDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		System.out.println("Enter Your Profession");
		String pro = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Your Loaction:");
		String loc = sc.nextLine();
		System.out.println("Enter your mailId:");
		String email = sc.nextLine();
		System.out.println("Enter your phone number:");
		long ph = sc.nextLong();
		sc.close();		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Profession:"+pro);
		System.out.println("Location:"+loc);
		System.out.println("Email Id:"+email);
		System.out.println("Phone Number:"+ph);
		
		
	}

}
