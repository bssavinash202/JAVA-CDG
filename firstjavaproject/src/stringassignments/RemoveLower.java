package stringassignments;

public class RemoveLower {
	public static void removeLowercase(String s) {
		StringBuffer str = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)==false) {
				str.append(ch);
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		 String s = "jAvA DeVeloPer";
	        removeLowercase(s);
	}
}
