package ArrayAssignment;

public class EvenPositions {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,9};
		int arrlength = arr.length;
		for(int i=0;i<arrlength;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+"\t");
			}
		}
	}

}
