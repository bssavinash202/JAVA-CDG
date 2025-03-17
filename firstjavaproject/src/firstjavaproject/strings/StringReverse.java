package firstjavaproject.strings;

public class StringReverse {

	public static void main(String[] args) {
		String input = "java";
		
		//toCharArray()
		char[] inputArray = input.toCharArray();
		for(char i: inputArray) {
			System.out.print(i+"\t");
		}
		System.out.println("\n===========Reverse String============");
		//to reverse the string
		for(int i=inputArray.length-1;i>=0;i--) {
			System.out.print(inputArray[i]+"\t");
		}
		System.out.println("\n=====Upper and Lower======");
		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		System.out.println("=Trimming the string- removing the trailing and leading spaces=");
		String s = "     Hyderabad     ";
		System.out.println(s.trim());
		System.out.println("\n=====startsWith======");
		String greeting = "Hello World";
		// startsWith() it returns boolean value true if the string starts with the specified string
		// in the startswith() method 
		
		System.out.println(greeting.startsWith("Hello"));
		//length() method 
		System.out.println(greeting.length());
		//Split() method
		String fruits = "Apple,Bannana,Cherry";
		String[] strArray =fruits.split(",");// delimiter is comma (,)
		for(String str: strArray) {
			System.out.print(str+" ");
		}
		System.out.println();
		String myStr="boo:and:foo";
		String[] bArray=myStr.split(":");//delimiter is colon(:)
		for(String str:bArray) {
			System.out.print(str+" ");
		}
	}

}
