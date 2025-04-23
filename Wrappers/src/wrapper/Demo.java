package wrapper;

public class Demo {
	public static void main(String[] args) {
//		primitive type a
		int a = 10;
		// Object type i -> int to Integer
		Integer i = Integer.valueOf(a);

		// Integer to int
		int b = i.intValue();

		int x = 20;
		// autoboxing
		Integer x1 = x;// automatic converison of primitive to Object.

		int x2 = x1;// auto-unboxing or Unboxing object to primitive
	}
}
