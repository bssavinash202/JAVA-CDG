package ArrayAssignment;

public class CopyOfArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,9};
		int arrlength = arr.length;
		int copy[]= new int[arrlength];
		for(int i=0;i<arrlength;i++) {
			copy[i]=arr[i];
		}
		for(int i: copy) {
			System.out.print(i+"\t");
		}
	}

}
