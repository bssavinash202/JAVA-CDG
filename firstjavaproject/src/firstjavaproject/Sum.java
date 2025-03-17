package firstjavaproject;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		System.out.println("Sum of 2 numbers: "+sum);
		sc.close();
	}

}
