package Opps.asgmtspoly.calculator;

public class Main {
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition of 2 integers: "+c.add(10, 20));
		System.out.println("Addition of 3 integers: "+c.add(100, 200, 300));
		System.out.println("Addition of 2 doubles: "+c.add(13.87, 2.98));
		System.out.println("Concatenation of 2 Strings: "+c.add("Hello ", "Avinash"));
		
	}
}
