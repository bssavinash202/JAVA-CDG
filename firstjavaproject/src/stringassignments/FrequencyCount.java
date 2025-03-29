package stringassignments;

import java.util.Arrays;

public class FrequencyCount {
	public static void freCount(String s) {
		System.out.println(s);
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		boolean found = false;
		int repeatedCount=0;
		int count =0;
		int i=0;
		while(i<ch.length) {
			count=1;
			while(i+1<ch.length&&ch[i]==ch[i+1]) {
				count++;
				i++;
			}
			if(count>1) {
				System.out.println(ch[i]+" - "+count);
				found=true;
				repeatedCount++;
			}
			i++;
		}
		System.out.println("repeatedCount: "+repeatedCount);
		if(!found) {
			System.out.println("no duplicate values");
		}
	}
	public static void main(String[] args) {
		String s = "javadev";
		freCount(s);
	}
}
