package ArrayAssignment;

public class PrimeArray {
	public static void main(String[] args) {
		int[] arr={13, 4, 56, 32, 99, 11,35,23,65,67};
		prime(arr);
	}
	public static void prime(int[] arr) {
		System.out.println("Prime numbers are: ");
		for(int num: arr) {
			int count = 0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(num+" ");
			}
		}
	}
}
