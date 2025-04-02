package Opps.asgmtspoly.Shape;

public class Shape {
	public int calculateArea(int side) {
		return side*side;
	}
	public int calculateArea(int length, int breadth) {
		return length*breadth;
	}
	public double calculateArea(double radius) {
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args) {
		Shape shape=new Shape();
		System.out.println("Area of a square: "+shape.calculateArea(6));
		System.out.println("Area of a Rectangle: "+shape.calculateArea(6,9));
		System.out.println("Area of a Circle: "+shape.calculateArea(7.0));
	}
}
