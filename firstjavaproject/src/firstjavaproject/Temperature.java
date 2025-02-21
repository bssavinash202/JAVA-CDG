package firstjavaproject;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the  Temperature in Celsius:");
		Scanner sc = new Scanner(System.in);
		float cel = sc.nextFloat();
		sc.close();
		float fahar = (cel*9/5) +32;
		System.out.println("Temperature in Fahrenheit is: " +fahar+" F deg");
		
		
	}

}
