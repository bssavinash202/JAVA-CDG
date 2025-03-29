package OOPS.inheritence;

// concrete class or implementation class -> which implements abstract methods from interface
public class EngineeringCollege implements College{
	
	boolean canteenExist;
	String collegeName;
	boolean libraryExist;
	int strength;
	String courseName;
	
	// 
	
	
	EngineeringCollege(int strength,boolean canteenExist,String collegeName,boolean libraryExist){
		this.strength=strength;
		this.canteenExist=canteenExist;
		this.collegeName=collegeName;
		this.libraryExist=libraryExist;
		
	}
	
	public boolean doesCanteenExist() {
		return canteenExist;
	}
	public String getName() {
		return collegeName;
	}
	public boolean doesLibraryExist() {
		return libraryExist;
	}
	public int getCollegeStrength() {
		return strength;
	}
	public String getEnggCourse() {
		return courseName="EEE";
	}
}
