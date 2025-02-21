import java.util.Scanner;

class ScannerDemo{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter SL.No:");
	int slNo = sc.nextInt();
	sc.nextLine();
	System.out.println("Serial Number is "+slNo);
	System.out.print("Enter your name: ");
	String name = sc.nextLine();
	System.out.println("your name is: "+name);
	}
}