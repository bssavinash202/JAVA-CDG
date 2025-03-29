package ArrayAssignment;

public class Binary {
	public static void swapOnesZeroes(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
			else {
				arr[i]=0;
			}
		}
		System.out.println();
		System.out.println("--------0 to 1 and 1 to 0-------");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,0,0,1,1,0,1,1,0,1,1};
		swapOnesZeroes(arr);

	}

}
