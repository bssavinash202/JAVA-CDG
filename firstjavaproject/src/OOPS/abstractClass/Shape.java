package OOPS.abstractClass;

abstract class Shape {
	
	//variable declaration
	double area;
	String shapeName;
	Shape(String shapeName){
		this.shapeName=shapeName;
	}
	//abstract method requires a abstract keyword in abstract class
	abstract void calculateArea();
	
	//non-abstract or concrete
	
	public void displayArea() {
		System.out.print("Area of a "+shapeName+" is "+area+" meters sqr");
	}
}

