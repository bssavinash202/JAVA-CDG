package ArrayAssignment;

public class MissingNumber {

	public static void missing(int[] arr) {
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		int n=arr.length-1;
		int expectedSum=((arr[n]+arr[0])*arr[n])/2;
		
		int ogSum = 0;
		for(int num:arr) {
			ogSum+=num;
		}
		int missingnum = expectedSum-ogSum;
		System.out.println("Missing Number is: "+missingnum);
	}
	
	public static void main(String[] args) {
		int arr[]= { 1,2,3,4, 6,7};
		missing(arr);
	}

}
