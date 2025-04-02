package Opps.assignments.Student;

public class Drive {
	public static void main(String[] args) {
		  StudentDetails student = new StudentDetails("21261D5401", "Avinash", new int[]{99,88,75,70,99});
	        System.out.println("Roll Number: " + student.getRollNumber());
	        System.out.println("Name: " + student.getName());
	        System.out.println("Average Marks: "+student.calculateAverage());
	        System.out.println("Status: "+(student.isPassed()?"Passed":"Failed"));
	}
}
