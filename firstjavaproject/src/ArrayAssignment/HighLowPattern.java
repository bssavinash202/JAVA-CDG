package ArrayAssignment;

public class HighLowPattern {
	public static void pattern(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length/2;i++) {
			System.out.print(arr[arr.length-1-i]+" ");
			System.out.print(arr[i]+" ");
		}
		if(arr.length%2!=0) {
			System.out.print(arr[arr.length/2]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {87,33,29,43,32,52,76};
		pattern(arr);
	}
}
