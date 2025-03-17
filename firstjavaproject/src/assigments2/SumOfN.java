package assigments2;
import java.util.Scanner;
public class SumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you Number");
		int n = sc.nextInt();
//		int sum = (n*(n+1))/2;
//		System.out.println(sum);
//		sc.close();
		int sum=0;
		for(int i = 1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}
	

}
