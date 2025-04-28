package collections;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", name = " + name + ", salary = " + salary + "]";
	}

}
