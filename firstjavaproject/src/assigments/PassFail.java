package assigments;

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks: ");
	int marks = sc.nextInt();
	if(marks<50 && marks>=0) {
		System.out.println("you failed in the exams");
	}
	else if(marks>=50 && marks<=100) {
		System.out.println("You passed in the exam");
	}
	else {
		System.out.println("Invalid marks Note: marks should be 0 to 100");
		
	}
	sc.close();
}
}
