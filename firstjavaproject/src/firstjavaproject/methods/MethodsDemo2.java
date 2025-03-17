package firstjavaproject.methods;

public class MethodsDemo2 {
	//a method without return type and no arguments
	public void welcomeMessage() {
		System.out.println("Welcome Avinash !");	 
	}	
	//a method without return type and no arguments
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	//a method with int return type and no arguments
	public int diplayNumber() {
		return 25;
	}
	//a method with string return type and no arguments
	public String diplayString() {
		return "Avinash";
	}
	//a method without return type and with arguments
	public static void main(String[] args) {
		MethodsDemo2 message = new MethodsDemo2();
		message.welcomeMessage();// Invoking or calling the instance method
		helloWorld();// static method calling
		int value = message.diplayNumber();
		System.out.println(value);
		System.out.println(message.diplayString());
	}
}
