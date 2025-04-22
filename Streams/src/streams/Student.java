package streams;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	//feild declared using transient to avoid serialization.
	private transient String password;
	
	Student(String name, int age, String password) {
		setName(name);
		setAge(age);
		setPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "{ Name: "+name+", Age: "+age+", Password: "+password+ "}";
	}
	
}
