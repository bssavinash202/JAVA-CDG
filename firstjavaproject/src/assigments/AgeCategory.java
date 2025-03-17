package assigments;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		if(age>=0 && age<=12) {
			System.out.println("You are a child");
		}else if(age>=13 && age<=19) {
			System.out.println("You are a Teen");
		}else if(age>=20 && age<=64) {
			System.out.println("You are an Adult");
		}
		else if(age>=65 && age<=150){
			System.out.println("You are a Senior");
		}
		else {
			System.out.println("Enter valid Age!");
		}
		sc.close();
	}

}
