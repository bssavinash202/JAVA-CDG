package OOPS.abstraction;


// class demonstrating multiple interface implementation
//follows specifications provided by drivable and flyiable interfaces
public class AirPlane implements Drivable,Flyiable{
	public void drive() {
//		String name;
		System.out.println("Airplane can be driven");
	}
	public void fly() {
		System.out.println("Airplane can fly");
	}
	
}
