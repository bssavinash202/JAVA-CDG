package stringassignments;

public class CountSub {
	public static void count(String str, String word) {
		String[] strArr = str.split(" ");
		int count = 0;
		for(String i:strArr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals(word)) {
				count++;
			}
		}
		System.out.println("\n"+count);
	}
	public static void main(String[] args) {
		String str1 = "we work to live and live to be happy live";  
		String word1 = "live";  
		count(str1,word1);
	}
}
