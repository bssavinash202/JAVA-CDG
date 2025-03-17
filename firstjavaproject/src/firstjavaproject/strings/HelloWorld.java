package firstjavaproject.strings;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * char ch[] = new char[5]; ch[0] = 'H'; ch[1] = 'e'; ch[2] = 'l'; ch[3] = 'l';
		 * ch[4] = 'o';
		 * 
		 * for(char c:ch) { System.out.print(c); } System.out.println(); String greeting
		 * = "Hello"; System.out.println(greeting); String greeting1 = new
		 * String("Avinash"); System.out.println(greeting1);
		 */
		String myString = new String("Codegnan");//String with new keyword
		String strLiteral = "Codegnan";// String with Literal
		System.out.println(myString);
		System.out.println(strLiteral);
		
		// == and equals()
		//using equals() for string comparision
		Boolean result = myString.equals(strLiteral);
		System.out.println(result);
		System.out.println(myString.equals(strLiteral));
	
		//using == for string comparision
		Boolean result1 = myString == strLiteral;
		System.out.println(result1);
	}
}
