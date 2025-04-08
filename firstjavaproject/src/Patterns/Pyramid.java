package Patterns;

public class Pyramid {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		int n=6;
		int spaces=n;
		int start=1;
		System.out.println("Pyramid of Numbers");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=start;j++) {
				System.out.print(i+" ");
			}
		System.out.println();
			start++;
			spaces--;
		}
		System.out.println("\nPyramid of Stars");
		int starSpaces=n;
		int starStart=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=starSpaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=starStart;j++) {
				System.out.print("* ");
			}
		System.out.println();
		starStart++;
		starSpaces--;
		}
		
	}
}
