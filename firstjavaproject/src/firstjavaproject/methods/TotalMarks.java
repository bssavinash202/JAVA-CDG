package firstjavaproject.methods;

public class TotalMarks {
	
	public int calculateMarks(int mark1, int mark2, int mark3) {
		return mark1+mark2+mark3;
	}
	
	public static void main(String[] args) {
		TotalMarks total = new TotalMarks();
		System.out.println("Total Marks: "+total.calculateMarks(20, 35, 42));
	}
}
