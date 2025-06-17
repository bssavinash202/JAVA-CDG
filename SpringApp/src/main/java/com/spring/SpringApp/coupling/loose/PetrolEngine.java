package com.spring.SpringApp.coupling.loose;

public class PetrolEngine implements Engine{
	
	
	public PetrolEngine() {
		System.out.println("petrol engine constructor called");
	}

	public void start() {
		System.out.println("Petrol engine starting..!");
	}
}
