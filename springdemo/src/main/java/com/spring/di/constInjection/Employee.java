package com.spring.di.constInjection;

public class Employee {
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("ID: "+getId()+" name: "+getName());
		address.showAddress();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
