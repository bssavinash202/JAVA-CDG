package stringassignments;

public class CountingWords {
	
	public static void count(String s) {
		System.out.println(s);
		String str[]=s.split(" ");
		for(String i:str) {
			System.out.print(i+" \t");
		}
		System.out.println();
		System.out.println("Words Count: " +str.length);
	}
	public static void main(String[] args) {
		String s = "I am a Java Developer";
		count(s);
	}
}
