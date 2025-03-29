package OOPS.inheritence;

public class MedicalCollege implements College{
	boolean canteenExist;
	String collegeName;
	boolean libraryExist;
	int strength;
	int numberOfBranches;
	
	
	MedicalCollege(int strength,boolean canteenExist,String collegeName,boolean libraryExist, int numberOfBranches){
		this.strength=strength;
		this.canteenExist=canteenExist;
		this.collegeName=collegeName;
		this.libraryExist=libraryExist;
		this.numberOfBranches=numberOfBranches;
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
	public int branches() {
		return numberOfBranches;
	}
}
