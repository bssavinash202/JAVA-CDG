package OOPS.abstractClass;

public class Square extends Shape{
	
	double side;
	Square(double side){
		super("Square");
		this.side=side;
	}
	@Override
	void calculateArea() {
		area = side*side;
		displayArea();
	}
}
