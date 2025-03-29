package Opps.assignments.Employee;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String dept;
	public Employee(int id, String name, double salary, String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}else {
			this.salary=0;
			System.out.println("Salary cannot be Negative");
		}
	}
	public String getDept() {
		return dept;
	}
	public double calculateBonus() {
		return salary*0.10;
	}
	public String toString() {
		return "Employee Details: {ID: "+id+", Name: '"+name+"', Salary: "+salary+", Department: '"+dept+"', Bonus: "+calculateBonus();
	}
}