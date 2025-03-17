package assigments;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first side: ");
		int side1 = sc.nextInt();
		System.out.println("Enter Your Second side: ");
		int side2 = sc.nextInt();
		System.out.println("Enter Your Third side: ");
		int side3 = sc.nextInt();
		if(side1==side2 || side2 == side3 || side1 == side2 ) 
		{
			if(side1==side2 && side2==side3) {
				System.out.println("Equilateral triangle");
			}
			else {
				System.out.println("Isosceles triangle");
			}
		}else {
			System.out.println("Scalene Triangle");
		}
		sc.close();
	}

}
