package firstjavaproject.methods;

public class Student {
	
	public void welcomeMessage() {
		System.out.println("Welcome students");
	}
	public void welcomeMessage1(String name, int age) {
		System.out.println("Welcome student "+name+" Age "+age);
	}
	public char getGender() {
		return 'M';
	}
	public String getFullName(String firstName,String lastName) {
		String fullName = firstName+lastName;
		return fullName;
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.welcomeMessage();
		student.welcomeMessage1("Shiva",22);
		student.welcomeMessage1("Sai",23);
		student.welcomeMessage1("Avinash",24);
		System.out.println(student.getGender());
		System.out.println(student.getFullName("Shivasai Avinash", " Bathala"));
	}
}
