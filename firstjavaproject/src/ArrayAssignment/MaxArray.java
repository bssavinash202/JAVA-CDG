package ArrayAssignment;

public class MaxArray {

	public static void main(String[] args) {
		int arr[]= {3,5,1,3,2,9,7,1,3,5,-1,-88,100};
		int max = arr[0];
		int min = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("max item: "+max);
		System.out.println("Min Item: "+min);
	}

}
