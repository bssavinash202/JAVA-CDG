package ExceptionHandling;

public class Test3 {
	public void doMoreStuff() throws Exception {
		System.out.println("Do more Stuff method called..!");
		int result = 10 / 0;
		System.out.println("Do more stuff method completed..!"+result);
	}

	public void doStuff() throws Exception {
		System.out.println("do Stuff method called..!");
		doMoreStuff();
		System.out.println("Do stuff method completed..!");
	}

	public static void main(String[] args) {
		System.out.println("Main method called..!");
		Test3 t = new Test3();
		try {
			t.doStuff();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method completed..!");
	}
}
