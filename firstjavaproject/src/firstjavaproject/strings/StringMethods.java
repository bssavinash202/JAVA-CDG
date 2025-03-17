package firstjavaproject.strings;

public class StringMethods {
	public static void main(String[] args) {
		String myGreeting = new String("Good");
		String myGreeting1 = new String("Good");
		String myGreeting2 = new String("Good");
		System.out.println("with new: "+(myGreeting==myGreeting1));
		String greeting1 = "Hi";
		String greeting2 = "Hi";
		System.out.println("with Literals: "+(greeting1==greeting2));
		
		//using concat method to concatenate strings
		
		// syntax: string1.concat(string2);
		/*
		 * greeting = greeting.concat(" ".concat(s)); System.out.println(greeting);
		 */
	}
}
