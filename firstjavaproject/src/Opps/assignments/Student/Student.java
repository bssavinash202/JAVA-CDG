package Opps.assignments.Student;

public class Student {
	private String rollNumber;
	private String name;
	private int marks[];
	public Student(String rollNumber, String name, int[] marks) {
		setRollNumber(rollNumber);
		setName(name);
		setMarks(marks);
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks.clone();
	}
	public void setMarks(int[] marks) {
		this.marks = marks.clone();
	}
	
	public double calculateAverage() {
		int sum =0;
		for(int mark:marks) {
			sum+=mark;
		}
		return (double) sum/marks.length;
	}
	public boolean isPassed() {
		return calculateAverage()>=40;
	}
	
	
	
}
