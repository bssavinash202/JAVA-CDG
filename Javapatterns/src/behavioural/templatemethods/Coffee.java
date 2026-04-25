package behavioural.templatemethods;

public class Coffee extends Beverage{

	@Override
	void brew() {
		System.out.println("Add Coffee powder and boil and filter");
	}

	@Override
	void addOtherIngredients() {
		System.out.println("Add Sugar and Milk..!");
	}

}
