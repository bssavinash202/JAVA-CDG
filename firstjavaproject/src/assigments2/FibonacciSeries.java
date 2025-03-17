package assigments2;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for printing Fibonacci");
		int n = sc.nextInt();
		int a = 0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		for(int i =3;i<=n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		sc.close();
	}
}
