package OOPS.practice;

public class Employee {
	
	//attributes of employee
	String name;
	double salary;
	//no arg constructor
	Employee(){
		System.out.println("Employee constructor");
	}
	
	//paramterized character
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee name: "+name);
		System.out.println("Employee Salary: "+salary);
	}
}
