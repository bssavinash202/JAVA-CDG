package ArrayAssignment;

import java.util.Arrays;

public class DuplicateValues {
	public static void dpv(int[] arr) {
		
		boolean found =false;
		int l=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<l-1;i++) {
			if(arr[i]==arr[i+1]) {
				int count=1;
				for(int j=i+1;j<l&&arr[i]==arr[j];j++) {
					count++;
				}
			System.out.println(arr[i]+" - "+count);	
			found=true;
			i=i+count-1;
			}
		}
		if(!found) {
			System.out.println("no duplicates");
		}
	}
	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 4, 8, 2, 7, 7, 9, 2};
		dpv(arr);
	}
}
