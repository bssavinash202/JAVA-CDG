package assigments;

import java.util.Scanner;

public class GradeCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		if(marks<=100 && marks>=0) {
			if(marks<=100 && marks>=90) {
				System.out.println("Your Grade is A");
			}else if(marks<=89 && marks>=80) {
				System.out.println("Your Grade is B");
			}else if(marks<=79 && marks>=70) {
				System.out.println("Your Grade is C");
			}else if(marks<=69 && marks>=60) {
				System.out.println("Your Grade is C");
			}else {
				System.out.println("Your Grade is F and You Failed");
			}
		}
		else {
			System.out.println("Your Marks are Invalid");
		}
		sc.close();

	}

}
