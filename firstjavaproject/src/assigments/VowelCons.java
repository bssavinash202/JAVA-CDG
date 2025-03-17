package assigments;

import java.util.Scanner;

public class VowelCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = sc.next().toLowerCase().charAt(0);
		/*
		 * if(letter>='a'&& letter<='z') {
		 * if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
		 * System.out.println(letter+" is a vowel"); } else {
		 * System.out.println(letter+" is a Consonent"); }
		 * 
		 * } else { System.out.println("Enter valid Input"); }
		 */
		if(letter>='a' && letter<='z') {
			switch(letter) {
			case 'a','e','i','o','u': System.out.println("vowel");
			break;
			default:System.out.println("Consonent");
		}
		}else if(Character.isDigit(letter)) {
			System.out.println(letter+ " is a Number");
		}
		else {
			System.out.println(letter+" is a Special Character");
		}
		sc.close();
		
	}

}
