package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> citiesSet = new LinkedHashSet<>();
		citiesSet.add("Hyderabad");
		citiesSet.add("Mumbai");
		citiesSet.add("Pune");
		citiesSet.add("Chennai");
		citiesSet.add("Hyderabad");
		citiesSet.add("Kochi");
//		citiesSet.add(null);
		

//		System.out.println(citiesSet);
		for (String city : citiesSet) {
			System.out.println(city.hashCode() + " - "+city);
		}
	}
}
