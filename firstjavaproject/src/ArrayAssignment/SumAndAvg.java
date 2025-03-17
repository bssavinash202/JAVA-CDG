package ArrayAssignment;
import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter array Length:");
		int sum = 0;
		int arrLength = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[arrLength];
		for(int i=0;i<arrLength;i++) {
			System.out.println("Enter the value of index "+i);
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arrLength;i++) {
			System.out.print(arr[i]+"\t");
			sum+=arr[i];
		}
		float avg=(float)sum/arrLength;
		System.out.println("");
		System.out.println("Sum of all Items: "+sum);
		System.out.println("Avg of all Items: "+avg);
	}

}
