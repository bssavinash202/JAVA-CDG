package stringassignments;

public class ReplaceSubString {
	public static void replace(String s) {
		StringBuffer str = new StringBuffer(s);
		String s1 = "Core";
		str.insert(0,s1+" ");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String s = "Java Developer";
		replace(s);
	}
}
