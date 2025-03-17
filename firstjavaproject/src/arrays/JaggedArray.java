package arrays;

public class JaggedArray {
	public static void main(String[] args) {
		// declaration of jagged array
		
		int[][] jaggedArr = new int[3][];
		
		//define different column sizes for each row
		
		jaggedArr[0] = new int[] {1,2,3};// row 1-> 3 columns
		jaggedArr[1] = new int[] {9}; // row 2 -> 1 columns
		jaggedArr[2] = new int[] {5,6,7,8};// row 3 -> 4 columns
		
		for(int i = 0;i<jaggedArr.length;i++) {
			for(int j =0;j<jaggedArr[i].length;j++) {
				System.out.print(" "+jaggedArr[i][j]);
			}
			System.out.println("");
		}
	}

}
