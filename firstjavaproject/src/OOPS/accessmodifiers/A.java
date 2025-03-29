package OOPS.accessmodifiers;

public class A {
	public void method1() {
		System.out.println("method1 from class A");
	}
	//no modifier
	void method2() {
		System.out.println("method2 from Class A");
	}
	private void method3() {
		System.out.println("Method3 from class A");
	}
	protected void method4() {
		System.out.println("Method4 protected from class A");
	}
	public static void main(String[] args) {
		A a = new A();
		a.method3();
		a.method4();
	}
}
