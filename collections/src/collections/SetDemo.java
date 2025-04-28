package collections;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> citiesSet = new HashSet<>();
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
