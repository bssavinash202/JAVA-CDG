package assigments;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Electricity: (KwH)");
		int kwh = sc.nextInt();
		if(kwh>0) {
			if(kwh<=100 && kwh>=0) {
				System.out.println("Your Power Bill is "+(kwh*3)+" rupees");
			}else if(kwh<=200 && kwh>=101) {
				System.out.println("Your Power Bill is "+(kwh*5)+" rupees");
			}else if(kwh<=300 && kwh>=201) {
				System.out.println("Your Power Bill is "+(kwh*7)+" rupees");
			}else {
				System.out.println("Your Power Bill is "+(kwh*10)+" rupees");
			}
		}
		else {
			System.out.println("Enter valid Power Consumption value in (KwH)");
		}
		sc.close();
	
}
}