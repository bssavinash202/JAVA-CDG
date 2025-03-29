package stringassignments;

public class Uniquechar {

	 public static String printUniqueCharacters(String s) {
	        String result = "";  // Store the result as a simple string

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            // If the character is not already in the result, add it
	            if (result.indexOf(c) == -1) {
	                result += c;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String s = "javajavajavadevdevdev";
	        String result = printUniqueCharacters(s);
	        System.out.println("Unique characters are: " + result);
	    }

}
