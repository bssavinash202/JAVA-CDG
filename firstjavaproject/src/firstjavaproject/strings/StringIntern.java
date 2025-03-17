package firstjavaproject.strings;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2  = "abc";
		System.out.println(s1==s2);//true
		
		String s3 = new String("abc");
		System.out.println(s1==s3);//false
		
		//appling the intern() method
		s3=s3.intern();
		System.out.println(s1==s3);
		

	}

}
