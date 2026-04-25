package behavioural.templatemethods;

abstract class Beverage {
	// template method - make it final so that it cannot be overriden
	
	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addOtherIngredients();
	}
	//common implementation
	void boilWater() {
		System.out.println("Boil Water..!");
	}
	void pourInCup() {
		System.out.println("pouring into the cup..!");
	}
	
	abstract void brew();
	
	abstract void addOtherIngredients();
}
