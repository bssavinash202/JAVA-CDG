package stringassignments;

public class Palindrome {
	public static void reverse(String s) {
		System.out.println(s);
		char[] inputArray = s.toCharArray();
		for(char i: inputArray) {
			System.out.print(i+"\t");
		}
		char[] revArray = new char[inputArray.length];
		System.out.println("\n===========Reverse String============");
		//to reverse the string
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[inputArray.length-1-i]+"\t");
			revArray[i]=inputArray[inputArray.length-1-i];
		}
		System.out.println();
		String rev = new String(revArray);
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("is a plaindrome");
		}else {
			System.out.println("is not a palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		reverse(s);
	}

}
