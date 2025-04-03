package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Test2 {
	public void method1() throws IOException {
		System.out.println("In method1()");
		FileReader file = new FileReader("abc.txt");
	}

	public void method2() {
		System.out.println("In method2()");
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("prg started..");
		Test2 t = new Test2();
		t.method2();
		System.out.println("prg ended..");
	}
}
