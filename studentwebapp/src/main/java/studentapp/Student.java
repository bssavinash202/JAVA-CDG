package studentapp;


public class Student {
	int id;
	private String name;
	private String email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
