package java8.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("Avinash");
		namesList.add("Shiva");
		namesList.add("Ajay");
		namesList.add("Chintu");

		Stream<String> nameStream = namesList.stream().filter(name -> name.startsWith("A"));
		List<String> filteredName = nameStream.collect(Collectors.toList());
		System.out.println(filteredName);

		// map() - intermediate function
		// map(duntion<T,R>)
		// map transforms elements of the stream
		List<Integer> numberList = List.of(5, 19, 34, 3, 45, 33, 56, 66);
		List<Integer> sqrNumbers = numberList.stream().map((n) -> n * n).collect(Collectors.toList());
		System.out.println("Squared numbers using map(): " + sqrNumbers);

		// distinct() - intermediate function - removes duplicates
		List<Integer> numberList1 = List.of(102, 2, 33, 45, 2, 56, 89, 65, 89, 45);
		List<Integer> noDuplicatesNos = numberList1.stream().distinct().collect(Collectors.toList());
		System.out.println(noDuplicatesNos);

		// sorted() - sorts the elements of the stream
		List<Integer> sortedList = noDuplicatesNos.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// Terminal operations
		// forEach():
		namesList.stream().forEach(name -> System.out.print(name + " "));
		System.out.println();
		numberList1.stream().distinct().forEach(num -> System.out.print(num + 10 + " "));
		System.out.println();

		// anyMatch() - tests a condition on the elements of the stream

		boolean anyEven = List.of(1, 2, 3).stream().anyMatch(num -> num % 2 == 0);
		System.out.println("Any Even ?: " + anyEven);

		boolean anyZero = List.of(1, 2, 3).stream().anyMatch(num -> num == 0);
		System.out.println("Any Zero ?: " + anyZero);
		
		boolean anyNonZero = List.of(1, 2, 3).stream().anyMatch(num -> num != 0);
		System.out.println("Any Non Zero ?: " + anyNonZero);

		// count() - returns the count of elements
		long count = numberList.stream().count();
		System.out.println("Count of elements in stream: "+count);

	}
}
