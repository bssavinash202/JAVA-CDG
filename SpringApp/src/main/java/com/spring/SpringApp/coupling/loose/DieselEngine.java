package com.spring.SpringApp.coupling.loose;

public class DieselEngine implements Engine{


	public DieselEngine() {
		System.out.println("diesel engine constructor called");
	}

	public void start() {
		System.out.println("diesel engine starting..!");
	}
}
