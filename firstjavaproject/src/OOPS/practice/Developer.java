package OOPS.practice;

// developer is the child of employee
public class Developer extends Employee {
	String prgLang;
	
	Developer(){
		
	}
	Developer(String name, double salary, String prgLang){
		//super class constructor to initialize name and salary
		super(name, salary);
		// initialzzing developer specified prglanguage
		this.prgLang=prgLang;
	}
	//overriding display
	public void displayEmployeeDetails() {
		/*
		 * System.out.println("Employee name: "+name);
		 * System.out.println("Employee Salary: "+salary);
		 */
		super.displayEmployeeDetails();
		System.out.println("Employee prg language: "+prgLang);
	}
}
