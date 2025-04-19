package streams;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int age;
	
	Student(String name, int age) {
		setName(name);
		setAge(age);
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
		return "{ Name: "+name+", Age: "+age+" }";
	}
	
}
