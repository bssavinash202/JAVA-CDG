package java8.methodreference.ConsRef;

public class Main {
	/*
	 * Message getMessage(String msg) { return new Message(msg); }
	 */
	public static void main(String[] args) {
		// using lambda expression
		Messageable m = (msg) -> new Message(msg);
		m.getMessage("Hello");

		// Anonymous
		Messageable m1 = new Messageable() {
			public Message getMessage(String msg) {
				return new Message(msg);
			}
		};
		m1.getMessage("Shivasai");

		//Using constructor refernce to implement the abstract method.
		Messageable m3 = Message::new;
		m3.getMessage("Avinash constructor ref demo");
	}
}
