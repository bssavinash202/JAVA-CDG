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
		
		Stream<String> nameStream = (Stream<String>) namesList.stream().filter(name->name.startsWith("A"));
		List<String> filteredName = nameStream.collect(Collectors.toList());
		System.out.println(filteredName);
	}
}
