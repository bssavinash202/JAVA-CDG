package behavioural.templatemethods;

public class Tea extends Beverage{
	void brew() {
		System.out.println("Add Tea powder and boil..!");
	}
	
	@Override
	void addOtherIngredients() {
		System.out.println("Add Sugar and Milk..!");
	}
}
