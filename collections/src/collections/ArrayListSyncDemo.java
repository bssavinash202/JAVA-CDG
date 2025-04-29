package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSyncDemo {
	public static void main(String[] args) {
		//step 1: create a normal arrayList
		//not a thread safe list.
		List<String> fruitList = new ArrayList<>();
		//Step2: make it thread safe by using Collections.synchronizedList();
		List<String> threadSafeList = Collections.synchronizedList(fruitList);
		
		//step 3:
		threadSafeList.add("apple");
		threadSafeList.add("Cherry");
		threadSafeList.add("Banana");
		threadSafeList.add("Dates");
		
		//step 4: access for elements in the list is now thread safe.
		System.out.println("First element: "+threadSafeList.get(0));
		
		synchronized(threadSafeList) {
			for(String fruit: threadSafeList) {
				System.out.println(fruit);
			}
		}
	}
}
