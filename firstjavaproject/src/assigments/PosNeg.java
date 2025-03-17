package assigments;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num+" is a Positive Number");
		}
		else if(num==0){
			System.out.println(num+" is Zero");
		}
		else {
			System.out.println(num+" is a Negative Number");
		}
		sc.close();
	}

}
