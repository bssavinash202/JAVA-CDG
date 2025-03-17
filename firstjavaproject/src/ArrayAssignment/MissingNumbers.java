package ArrayAssignment;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {22, 17, 4, 66, 8, 2, 87};
        
        for(int num:arr) {
        	System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Missing numbers from 1 to 100 are:");
        for (int i = 1; i <= 100; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    break;
                }
               
            }	
            if (j == arr.length) { // Not found in the array
                System.out.print(i + " ");
            }
           
        }
    }
}

