package firstjavaproject.strings;

public class MutableString {

	public static void main(String[] args) {
		/*
		 * String greeting = "Hello"; greeting.concat("World !");// immutable
		 * System.out.println(greeting);
		 * 
		 * StringBuilder myGreeting = new StringBuilder("Hello");
		 * myGreeting.append(" World!"); // mutable String
		 * System.out.println(myGreeting);
		 * 
		 * StringBuffer myGreeting1 = new StringBuffer("Hi");
		 * myGreeting1.append(" How are You"); System.out.println(myGreeting1);
		 */
		//Methods of StringBuffer and StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		StringBuffer sbf = new StringBuffer("java");
		sb.append(" Programming");
		sbf.append(" Programming");
		System.out.println("Append "+sb+" | "+sbf);
		
		sb.insert(5, " Awesome ");
		sbf.insert(5," Awesome ");
		System.out.println("insert "+sb+" | "+sbf);
		System.out.println(sb.reverse()+" | "+sbf.reverse());
		
	}

}
