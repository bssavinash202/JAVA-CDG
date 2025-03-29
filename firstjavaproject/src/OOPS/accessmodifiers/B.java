package OOPS.accessmodifiers;

public class B extends A {
	//overriding method() of class A only public is allowed for overridden for public method
	public void method1() {
		System.out.println("Overriden public method of class A");
	}
	//public, protected are allowed for overridden no access modifier 
	void method2() {
		System.out.println("Overriden no modifier method of class A");
	}
	// cannot change to default modifier for protected
	protected void method4() {
		System.out.println("overridden protected method");
	}
}
