package OOPS;

public class Car {
	// instance variables
	String engine;
	int mileage;
	String model;
	double price;
	String color;
	
	// default constructor 
	Car(){
	 System.out.println("Default constructor called"); }
	 
	// parameterized constructor
	Car(String engine, int mileage, String model, double price, String color) {
		System.out.println("Initializing Car Objects using parameterized"+color);
		this.engine = engine;
		this.price = price;
		this.color = color;
		this.model = model;
		this.mileage = mileage;
	}
	//Copy Constructor
	Car(Car OtherCar){
		System.out.println("Using copy constructor");
		this.engine = OtherCar.engine;
		this.price = OtherCar.price;
		this.color = OtherCar.color;
		this.model = OtherCar.model;
		this.mileage = OtherCar.mileage;
	}

	public static void main(String[] args) {
//		default constructor

		Car suzuki = new Car();
		suzuki.engine="hybrid";
		suzuki.mileage=18;
		suzuki.price=2000000;
		suzuki.model="vitara";
		suzuki.color="brown";
		
		System.out.println(suzuki.engine);
		System.out.println(suzuki.mileage);
		System.out.println(suzuki.model);
		System.out.println(suzuki.price);
		System.out.println(suzuki.color);
		System.out.println();System.out.println();
		
		
		
		
		
		Car kia = new Car("Diesel engine", 14, "Seltos", 1500000, "blue");

		/*
		 * kia.engine="Diesel engine"; kia.mileage=14; kia.model="Seltos";
		 * kia.price=1500000; kia.color="blue";
		 */

		System.out.println(kia.engine);
		System.out.println(kia.mileage);
		System.out.println(kia.model);
		System.out.println(kia.price);
		System.out.println(kia.color);
		System.out.println();System.out.println();
		
		
		
		Car honda = new Car("petrol", 10, "i20", 2500000, "white");
		/*
		 * honda.engine="Petrol Engine"; honda.mileage=12; honda.model="i";
		 * honda.price=1000000; honda.color="white";
		 */

		System.out.println(honda.engine);
		System.out.println(honda.mileage);
		System.out.println(honda.model);
		System.out.println(honda.price);
		System.out.println(honda.color);
		System.out.println();System.out.println();
		
		//Create a exact copy of Honda Object by calling the copy constructor
		Car anotherHonda = new  Car(honda);
		System.out.println(anotherHonda.engine);
		System.out.println(anotherHonda.mileage);
		System.out.println(anotherHonda.model);
		System.out.println(anotherHonda.price);
		System.out.println(anotherHonda.color);
	}
}
