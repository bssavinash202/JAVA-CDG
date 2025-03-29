package OOPS.abstractClass;

public class Driver  {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(8,10);
		r.calculateArea();
		
		System.out.println();
		Triangle t = new Triangle(10,10);
		t.calculateArea();
		
		System.out.println();
		Square s = new Square(5);
		s.calculateArea(); 
		
		
		 
	}
}
