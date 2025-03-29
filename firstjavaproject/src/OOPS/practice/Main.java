package OOPS.practice;

public class Main {
	public static void main(String[] args) {
 		
		Developer developer = new Developer();
		developer.name="Avinash";
		developer.salary=50000;
		developer.displayEmployeeDetails();
		System.out.println("------------------------------");
		
		Developer developer1 = new Developer("sai",60000.0,"Java");
		developer1.displayEmployeeDetails();
		System.out.println("------------------------------");
		Manager manager = new Manager();
		manager.name="Shivasai";
		manager.salary=80000;
		manager.displayEmployeeDetails();
		
	}
}
