package streams.Demo;

public class Main {
	public static void main(String[] args) {

		Dog dog = new Dog();// normal way to create a dog object

		Animal a = new Dog();// Object upcasting -> child class object is stored in parent class reference
		a.makeSound();
		Animal animal = new Dog	();
		if(animal instanceof Dog) {
			Dog d = (Dog) animal;// both are down casting
			d.bark();
		}
	}
}
