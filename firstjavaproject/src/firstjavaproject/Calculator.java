package firstjavaproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the Operator");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+': System.out.println("Sum of two numbers: "+(num1+num2));
					break;	
		case '-': System.out.println("Difference of two numbers: "+(num1-num2));
					break;
		case '*': System.out.println("Product of two numbers: "+(num1*num2));
					break;
		case '%': System.out.println("Remainder of two numbers: "+(num1%num2));
					break;
		case '/': if(num2==0) 
					{
						System.out.println("Second Number cannot be Zero it goes to infinity");
					}
				else {
						System.out.println("Sum of two numbers: "+(num1/num2));
					}
					break;
		default : System.out.println("Enter Valid Opeartor");
		break;
		}
		
	}

}
