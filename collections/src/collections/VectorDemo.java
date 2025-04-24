package collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vCountryList = new Vector<>();
		
		vCountryList.add("Japan");
		vCountryList.add("India");
		vCountryList.add("America");
		vCountryList.add("China");
		vCountryList.add("Russia");
		vCountryList.add("Germany");
		System.out.println(vCountryList);
		
		vCountryList.add(2, "Australia");
		System.out.println(vCountryList);
		
		vCountryList.remove("China");
		System.out.println(vCountryList);
		
		vCountryList.removeElement("Japan");
		System.out.println(vCountryList);
		
		vCountryList.removeElementAt(2);
		System.out.println(vCountryList);
		
	}
}
