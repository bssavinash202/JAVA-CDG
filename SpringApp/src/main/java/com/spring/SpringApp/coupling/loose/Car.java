package com.spring.SpringApp.coupling.loose;

public class Car {

	// dependency for Car
//	PetrolEngine pEngine;
//	DieselEngine dEngine;
	Engine engine;
	public Car(Engine engine) {
		System.out.println("injecting Engine dependency to car");
		// dependency injection for car
//		pEngine = new PetrolEngine();
		//engine = new DieselEngine();
		this.engine=engine;
	}

	//method to start car
	public void startCar() {
		System.out.println("Starting car..");
		//calling start() of engine to start the engine.
		engine.start();
		System.out.println("Started car..");

	}
}
