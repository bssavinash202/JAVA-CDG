public class ArithmeticOperations {
    public static void main(String args[]) {
        
        int num1 = 100;
		int num2 = 12;

        
        int sum = num1 + num2;         // Addition
        int difference = num1 - num2;  // Subtraction
        int product = num1 * num2;     // Multiplication
        int quotient = num1 / num2;    // Division
        int remainder = num1 % num2;   // Modulus

        
        System.out.println("Number 1: " + num1); // 100
        System.out.println("Number 2: " + num2); //12
        System.out.println("Addition: " + sum); //112
        System.out.println("Subtraction: " + difference); //88 
        System.out.println("Multiplication: " + product); //1200
        System.out.println("Division: " + quotient); //8
        System.out.println("Modulus: " + remainder); // 4
    }
}
