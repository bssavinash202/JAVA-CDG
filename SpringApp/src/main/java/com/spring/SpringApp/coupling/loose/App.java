package com.spring.SpringApp.coupling.loose;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		PetrolEngine pEngine=new PetrolEngine();
		Car pcar = new Car(pEngine);
		pcar.startCar();
		System.out.println();
		System.out.println();
		DieselEngine dEngine = new DieselEngine();
		Car dCar = new Car(dEngine);
		dCar.startCar();
	}
}
