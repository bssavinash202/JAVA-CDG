package ArrayAssignment;

public class FirstLast {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,9};
		int arrlength = arr.length;
		for(int i=0;i<arrlength;i++) {
			if(i==0) {
				System.out.println("first element is "+arr[i]);
			}
			if(i==arrlength-1) {
				System.out.println("last element is "+arr[i]);
			}
		}
	}

}
