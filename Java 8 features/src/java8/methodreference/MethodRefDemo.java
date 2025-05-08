package java8.methodreference;

public class MethodRefDemo {
	
	boolean evenChecker(int i) {
		if(i%2==0) {
			return true;
		}else return false;
	}
	
	static boolean evenChecker1(int i) {
		if(i%2==0) {
			return true;
		}else return false;
	}
	
	public static void main(String[] args) {
//		MyFunctionalInterface m = (n) -> n % 2 == 0;
//		System.out.println(m.isEvenNumber(5));
		
		//for instance method refeernce
		MethodRefDemo md = new MethodRefDemo();
		MyFunctionalInterface mfi = md :: evenChecker;
		System.out.println(mfi.isEvenNumber(32));
		
		//static method reference
		MyFunctionalInterface mfi2 = MethodRefDemo :: evenChecker1;
		System.out.println(mfi2.isEvenNumber(29));
	}
}
