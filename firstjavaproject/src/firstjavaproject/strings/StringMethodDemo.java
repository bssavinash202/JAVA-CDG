package firstjavaproject.strings;

public class StringMethodDemo {
	public static void main(String[] args) {
		String email = "avinash@gmail.com";
		//indexOf() method: returns the index of the first occurance of the specified character
		System.out.println(email.indexOf('s'));
		
		//substring() method: used to extract the part of the string
		System.out.println(email.substring(0, 7));//
		System.out.println(email.substring(4, 5));
		
		String userName = email.substring(0,email.indexOf('@'));
		System.out.println("USERNAME: "+userName);
		
		//charAt() method: used to extract character at the specified index
		System.out.println(email.charAt(3));
	}
}
