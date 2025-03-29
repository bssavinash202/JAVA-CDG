package stringassignments;

public class Replace {
	public static void replaceChar(String s) {
		System.out.println(s);
		char[] strArray = s.toCharArray();
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i]=='e') {
				strArray[i]='a';
			}
		}
		for(char i: strArray) {
			System.out.print(i+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		String str = "java development";
		replaceChar(str);
	}
}
