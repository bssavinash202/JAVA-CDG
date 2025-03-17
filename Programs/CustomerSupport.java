import java.util.Scanner;
class CustomerSupport{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Billing Issues");
		System.out.println("2. Technical Support");
		System.out.println("3. Account Management");
		System.out.println("4. Talk to Customer Support Rep");
		System.out.println("5. Exit");
		System.out.println("Please select an Option (1-5)");
		int choice = sc.nextInt();
		
		switch(choice){
			
			case 1:
				System.out.println("Visit www.xyz.com/billing");
				break;
			case 2:
				System.out.println("Visit www.xyz.com/TechnicalSupport");
				break;
			case 3:
				System.out.println("Visit www.xyz.com/Account");
				break;
			case 4:
				System.out.println("Visit www.xyz.com/CustomerSupport");
				break;
			case 5:
				System.out.println("Thank you have a good Day!");
				break;
			default: 
				System.out.println("Invalid Selection, Please Enter Valid option");
			
			
		
		}
	}

}