package com.spring.di.setterInjection;

public class Director {
	
	private String name;
	private int experience;
	
	public void showInfo() {
		System.out.println("Director: "+name+", Experience: "+experience);
	}

	public String getName() {
		return name;
	}

	public int getExperience() {
		return experience;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
