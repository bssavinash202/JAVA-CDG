import java.util.Scanner;
class IfDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.println("Eligible to Vote");
		}else{
			System.out.println("Not eligible to Vote");
		}
	}
}