package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer[] numbers = {5,3,8,1,9};
		System.out.println("Original Array");
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(numbers);
		System.out.println("After Sorting");
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Array to ArrayList conversion");
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
		
		for(Integer number:numberList) {
			System.out.print(number+" ");
		}
		System.out.println();
		String[] fruitList = {"Apple","banana","Cherry"};
		ArrayList<String> fruitsArrayList = new ArrayList<>(Arrays.asList(fruitList));
		for(String fruit: fruitsArrayList) {
			System.out.print(fruit+" ");
		}
		System.out.println(fruitsArrayList);
	}

}
