package Opps.asgmtspoly.Employee;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private String department;
	
	Employee(String name, int id){
		this.name=name;
		this.id=id;
		this.salary=0.0;
		this.department="Not Assigned";
	}
	Employee(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.department="Not Assigned";
	}
	Employee(String name, int id, double salary, String department){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.department=department;
	}
	public void displayDetails() {
		System.out.println("Employee ID: "+id);
		System.out.println("Name of the Employee: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}
	public static void main(String[] args) {
		Employee emp1=new Employee("Avinash",101);
		Employee emp2=new Employee("Shivasai",102,10000);
		Employee emp3=new Employee("Lokesh",103,26000,"HR");
		
		emp1.displayDetails();
		System.out.println("\n============\n");
		emp2.displayDetails();
		System.out.println("\n============\n");
		emp3.displayDetails();
		
	}
}
