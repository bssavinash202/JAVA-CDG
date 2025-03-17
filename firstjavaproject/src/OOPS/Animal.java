package OOPS;

public class Animal {
	String color;
	String size;
	String type;
	int walk;
	
	Animal(){
		System.out.println("Using default constructor");
		System.out.println("-----------------------");
	}
	Animal(String color,String size,String type, int walk){
		System.out.println("Using Parameterized Constructor");
		System.out.println("-------------------------");
		this.color=color;
		this.size=size;
		this.type=type;
		this.walk=walk;
	}
	public static void main(String[] args) {
		Animal lion = new Animal();
		lion.color="Yellow";
		lion.size="Big";
		lion.type="Carnivorus";
		lion.walk=4;
		System.out.println("Lion color: "+lion.color);
		System.out.println("Lion size: "+lion.size);
		System.out.println("Lion type: "+lion.type);
		System.out.println("Lion walks on: "+lion.walk+" legs");
		System.out.println();System.out.println();
		
		Animal rabbit = new Animal("White","small","Herbivorous",4);
		
		rabbit.walk=4;
		System.out.println("Rabbit color: "+rabbit.color);
		System.out.println("Rabbit size: "+rabbit.size);
		System.out.println("Rabbit type: "+rabbit.type);
		System.out.println("Rabbit walks on: "+rabbit.walk+" legs");
		
		System.out.println();System.out.println();
		Animal human = new Animal("fair,black,brown","medium","Omnivore",2);
	
		System.out.println("Humans color: "+human.color);
		System.out.println("Humans size: "+human.size);
		System.out.println("Humans type: "+human.type);
		System.out.println("Humans walks on: "+human.walk+" legs");
		
	}
}
