package behavioural.templatemethods;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		System.out.println("Making Tea..");
		
		Beverage tea = new Tea();
		tea.prepareBeverage();
		
		
		System.out.println("\n");
		System.out.println("Make Coffee..");
		Beverage coffee = new Coffee();
		coffee.prepareBeverage();
	}
}
