package Opps.asgmtspoly.Student;

public class Student {
	private String name;
	private int rollNumber;
	private String[] subjects;
	
	public void setDetails(String name) {
		this.name=name;
		this.rollNumber=-1;
		this.subjects= new String[0];
	}
	public void setDetails(String name, int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.subjects= new String[0];
	}
	public void setDetails(String name, int rollNumber, String[] subjects) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.subjects= subjects;
	}
	public void displayDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Roll Number: "+(rollNumber==-1?"Not Assigned":rollNumber));
		System.out.print("Subjects: ");
		if(subjects.length==0) {
			System.out.println("No Subjects Assigned");
		}else {
			for(String subject:subjects) {
				System.out.print(subject+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setDetails("Avinash");
		
		Student student2 = new Student();
		student2.setDetails("Shivasai",102);
		
		Student student3 = new Student();
		student3.setDetails("Lokesh",103, new String[] {"Maths","Science","English"});
		
		 student1.displayDetails();
	        System.out.println("\n==================\n");
	        student2.displayDetails();
	        System.out.println("\n==================\n");
	        student3.displayDetails();
	}
}
