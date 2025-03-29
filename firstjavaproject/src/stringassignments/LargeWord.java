package stringassignments;

public class LargeWord {
	
	public static void large(String s) {
		String str="";
		String[] sArr = s.split(" ");
		for(int i=0;i<sArr.length;i++) {
			if(sArr[i].length()>str.length()) {
				str=sArr[i];
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String s = "I am a java developer from hyderabad";
		large(s);
	}
}
