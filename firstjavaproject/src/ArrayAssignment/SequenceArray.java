package ArrayAssignment;

public class SequenceArray {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=1;
		for(int i=1;i<arr.length;i++) {
			arr[i]=(i*i)+1;
		}
		for(int i =0;i<arr.length;i++) {
			
				System.out.print(arr[i]+",");
		}
	}
}
