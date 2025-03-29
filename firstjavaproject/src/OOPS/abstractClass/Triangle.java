package OOPS.abstractClass;

public class Triangle extends Shape{

	double height;
	double base;
	Triangle(double height, double base){
		super("Triangle");
		this.height=height;
		this.base=base;
	}
	@Override
	void calculateArea() {
		area =	0.5*height*base;
		displayArea();
		
	}

}
