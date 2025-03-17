package stringassignments;

public class VowelCount {
	
	public static void vowelcount(String s) {
		
		System.out.println(s);
		int count=0;
		String l = s.toLowerCase();
		for(int i=0;i<l.length();i++) {
		if(l.charAt(i)=='a'||l.charAt(i)=='e'||l.charAt(i)=='i'||l.charAt(i)=='o'||l.charAt(i)=='u') {
			count++;
		}			
		}
		System.out.println("vowel count is "+count);
	}
	
	public static void main(String[] args) {
		String s = "JavadevE";
		vowelcount(s);
	}
}
