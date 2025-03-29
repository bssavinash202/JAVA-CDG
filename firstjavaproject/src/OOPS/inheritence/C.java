package OOPS.inheritence;
import OOPS.accessmodifiers.*;
public class C extends A {
	public static void main(String[] args) {
		A a= new A();
		a.method1();//public method
//		a.method2();//no modifier not accessible in different package
//		a.method3();// private not accessible
//		a.method4();// protected not accessible
		
		// accessing protected method from class A
		C c = new C();
		c.method1();//public
		
		c.method4();//protected
}
}
