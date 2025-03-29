package stringassignments;

public class RemoveVowels {
	public static void removeVowel(String s) {
		StringBuffer str = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			char ch = s.toLowerCase().charAt(i);
			if(ch!='a'&& ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				str.append(ch);
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		 String s = "ja123vaDEveloper";
	        removeVowel(s);
	}
}
