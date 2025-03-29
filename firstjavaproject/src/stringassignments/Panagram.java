package stringassignments;

public class Panagram {
	public static void pan(String a) {
		a=a.toLowerCase();
		int count=0;
		for(char ch='a';ch<='z';ch++) {
			if(a.indexOf(ch)!=-1) {
				count++;
			}
		}
		if(count==26) {
			System.out.println("is a panagram");
		}
		else {
			System.out.println("is not a panagram");
		}
	}
	public static void main(String[] args) {
		String a = "The quick brown fox jumps over the lazy dog";
		pan(a);
	}
}