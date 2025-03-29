package stringassignments;

public class RemoveSpaces {
	public static void remove(String s) {
		StringBuffer str = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
				if(ch!=' ') {
					str.append(ch);
				}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String s = "Java Developer";
		remove(s);
	}
}