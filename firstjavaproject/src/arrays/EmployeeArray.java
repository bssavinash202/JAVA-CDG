package arrays;
import java.util.Scanner;

public class EmployeeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of rows and columns (N x N): ");
        int n = sc.nextInt();
        sc.nextLine(); 

      
        String[][] city = new String[n][n];

     
        System.out.println("Enter the names of cities (row-wise):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter city at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                city[i][j] = sc.nextLine();
            }
        }

        
        System.out.println("\n--- Displaying the City Grid ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(city[i][j] + "\t"); 
            }
            System.out.println(); 
        }

        sc.close(); 
    }
}
