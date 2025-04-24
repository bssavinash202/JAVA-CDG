package collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> citiesList = new LinkedList<>();
		citiesList.add("hyderabad");
		citiesList.add("Chennai");
		citiesList.add("Delhi");
		citiesList.add("pune");
		citiesList.add("mumbai");
		citiesList.add("Secunderabad");
		// linkedlist overrides toString() method.
		System.out.println(citiesList);

		citiesList.addFirst("kolkata");
		System.out.println(citiesList);

		citiesList.addLast("kolkata");
		System.out.println(citiesList);

		citiesList.removeFirst();
		System.out.println(citiesList);

		citiesList.removeLast();
		System.out.println(citiesList);
	}
}
