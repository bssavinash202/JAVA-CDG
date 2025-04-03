package ExceptionHandling;

public class Test {
	public void method1() throws ArithmeticException {
		System.out.println("In method1()");
		int result = 10 / 0;
	}

	public void method2() {
		System.out.println("In method2()");
		try {
			method1();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("prg started..");
		Test t = new Test();
		t.method2();
		System.out.println("prg ended..");
	}
}
