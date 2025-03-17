package assigments2;

import java.util.Scanner;

public class TableOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you Number");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}
		sc.close();
	}

}
