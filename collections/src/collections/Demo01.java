package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Shiva", 20000);
		Employee emp2 = new Employee(101, "Avinash", 30000);
		Employee emp3 = new Employee(102, "Prince", 40000);

		@SuppressWarnings("unused")
		Employee[] empArray = { emp1, emp2, emp3 };

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println("Before sorting");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		Collections.sort(empList);
		System.out.println("After sorting");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
