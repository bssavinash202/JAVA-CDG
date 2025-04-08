package Patterns;

public class Stars {
	public static void main(String[] args) {
		int n=6;
		System.out.println("right angle\n");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("reverse right angle\n");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("Inverted right angle\n");
		int spaces=n;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("* ");
			}
			System.out.println();
			stars++;
			spaces--;
		}
		
		System.out.println("Inverted reverse right angle\n");
		int space=1;
		int star=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
		
		
	}
}
