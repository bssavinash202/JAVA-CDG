package OOPS;

public class Employee {
	private String name;
	private int age;
	private String department;
	private static String companyName;
	Employee(String name){
		this.name=name;
	}
	
	// constructor without args
//	Employee(){
//		// calling a constructor with a string argument
//		this("Avinash");
////		System.out.println("No args constructor called");
//	}
//	//constructor with args
//	Employee(String name){
//		this(name,22,"IT");
//		System.out.println(this.name=name);
////		System.out.println("1 args constructor called");
//	}
//	//constructor with three args
//	Employee(String name, int age, String department){
//		this.name=name;
//		this.age=age;
//		this.department=department;
////		System.out.println("All args constructor called");
//	}
//	void display() {
////		this.greet();
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(department);
//	}
//	void display(String message) {
////		this.greet();
//		System.out.println(message);
//		System.out.println(age);
//		System.out.println(department);
//	}
//	void greet() {
//		System.out.println("Hello!");
//	}
//
//	/*
//	 * we cannot use this key word in static methods 
//	 * static void test() {
//	 * this.greet(); }
//	 */
	
	Employee(String name, int age, String department){
		this.name=name;
		this.age=age;
		this.department=department;
	}
	// getter methods
	public String getName() {
		if(age>18) {
			return name;
		}else {
			return "Employee not found";
		}
	}
	
	// setter method
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
			return age;
	}
	public void setAge(int age) {
		if(age>0) {	
		this.age=age;
		System.out.println(this.age);
		}else {
			System.out.println("age cannot be negative");
		}
	}
	// static block
	static {
		System.out.println("Static block is called");
		companyName="Codegnan";
	}
	{
		System.out.println("Instance block");
	}
	
	public static void main(String[] args) {
		// instanting employee
		System.out.println("Main method is called");
		Employee employee = new Employee("Kumar");
//		employee.display();
		System.out.println(employee.name);
		
	}
}
