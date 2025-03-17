package ArrayAssignment;

public class ReverseArray {
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,9};
		int arrlength = arr.length;
		int rev[]= new int[arrlength];
		for(int i=0;i<arrlength;i++) {
			rev[i]=arr[(arrlength-1)-i];
		}
		for(int i: rev) {
			System.out.print(i+"\t");
		}
	}
}
