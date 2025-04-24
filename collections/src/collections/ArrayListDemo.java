package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> fruitsList = new ArrayList<>();
		fruitsList.add("Apple");
		fruitsList.add("Banana");
		fruitsList.add("Cherry");
		fruitsList.add("Mango");
		fruitsList.add("Apple");
//		for(String i:fruitsList) {
//			System.out.print(i+" ");
//		}
		System.out.println(fruitsList);
		System.out.println(fruitsList.contains("Apple"));// checks whether the specified object is present or not,return
															// Boolean
		System.out.println(fruitsList.get(0));// returns an object present in specified index
		System.out.println(fruitsList.remove(3));// removes the object at specified index
		System.out.println(fruitsList.indexOf("Apple"));// returns index of a specified object in ArrayList
		System.out.println(fruitsList);

	}

}
