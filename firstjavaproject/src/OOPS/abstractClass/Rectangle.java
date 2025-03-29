package OOPS.abstractClass;

public class Rectangle extends Shape {

	double length;
	double width;
	Rectangle(double length,double width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	@Override
	void calculateArea() {
			area = length*width;
			displayArea();
	}
	
}
