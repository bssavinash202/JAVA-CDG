package com.spring.di.fieldinjection;

public class Singer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Singer(String name) {
		this.name = name;
	}
	
	public void sing() {
		System.out.println("Singer: "+getName()+" is singing..!");
	}

}
