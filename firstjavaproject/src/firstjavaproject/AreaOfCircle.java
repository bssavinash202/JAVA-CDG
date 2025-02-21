package firstjavaproject;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: (in meters)");
		float radius = sc.nextFloat();
		double area = pi*radius*radius;
		System.out.println("Area of a Circle is "+area+" Meters^2");

	}

}
