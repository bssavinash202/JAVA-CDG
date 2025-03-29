package stringassignments;

public class RemoveDigit {
	public static void removeDigit(String s) {
		StringBuffer str = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)==false) {
				str.append(ch);
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		 String s = "ja123vaDEveloper";
	        removeDigit(s);
	}
}
