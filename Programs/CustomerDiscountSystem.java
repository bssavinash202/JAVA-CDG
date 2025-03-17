import java.util.Scanner;
class CustomerDiscountSystem{

	public static void main(String[] args){
	
		int bronzePoints = 1000;
		int silverPoints = 5000;
		int goldPoints = 10000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Loyalty Points: ");
		int points = sc.nextInt();
		// Determine the discounts based on the points
		if(points>=goldPoints){
			System.out.println("You are a Gold Member");
			System.out.println("You will get a 50% discount on all purchases");
		}else if(points>=silverPoints){
			System.out.println("You are a Silver Member");
			System.out.println("You will get a 20% discount on all purchases");
		}else if(points>=bronzePoints){
			System.out.println("You are a Bronze Member");
			System.out.println("You will get a 10% discount on all purchases");
		}
		else{
			System.out.println("No discount available earn more loyalty points");
		}
		sc.close();
	
	}


}