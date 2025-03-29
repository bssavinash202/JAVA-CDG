package stringassignments;

public class RemoveCapital {
	public static void removeUppercase(String s) {
		StringBuffer str = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)==false) {
				str.append(ch);
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		 String s = "jAvA DeVeloPer";
	        removeUppercase(s);
	}
}
