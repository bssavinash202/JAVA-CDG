package stringassignments;

import java.util.Arrays;

public class Anagram {
	public static void anagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		if(Arrays.equals(a1, b1)) {
			System.out.println("is an anagram");
		}
		else {
			System.out.println(" not an anagram");
		}
		
	}
	public static void main(String[] args) {
		String a = "save";
		String b = "vase";
		anagram(a,b);
	}
}
