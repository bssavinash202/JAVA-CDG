package stringassignments;

public class CountCharacters {
	public static void count(String s) {
		System.out.println(s);
		int counter = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				counter++;
			}
			
		}
		System.out.println("Count: "+counter);
		
	}
	
	public static void main(String[] args) {
		String s = "javaEEdeve";
		count(s);
	}

}
