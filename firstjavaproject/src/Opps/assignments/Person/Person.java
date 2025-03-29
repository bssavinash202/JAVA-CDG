package Opps.assignments.Person;

public class Person {
	private String name;
	private int age;
	private String email;
	public Person(String name, int age, String email) {
		
		setName(name);
		setAge(age);
		setEmail(email);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null&& name.isEmpty()) {
			this.name = "name cannot be Empty";
		}else {
			this.name=name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;	
		}else {
			this.age=0;
			System.out.println("age cannot be nagative");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.indexOf('@')==-1) {
			this.email=email;
		}else {
			
			this.email = "Invalid Email";
		}
	}
	
	public String toString() {
		return "Person: Name: '"+name+"', Age: "+age+", email: '"+email+"'";
	}
	
	
	
}
