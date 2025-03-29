package OOPS.inheritence;

public class Driver {
	public static void main(String[] args) {
		
		EngineeringCollege college1 = new EngineeringCollege(10000,true,"MGIT",true);
		String collegeName =  college1.getName();
		int strength = college1.strength;
		boolean canteen = college1.doesCanteenExist();
		boolean library = college1.libraryExist;
		String course = college1.getEnggCourse();
		System.out.println("Engineering college name: "+collegeName);
		System.out.println("College Strength: "+strength);
		System.out.println("Does canteen exist: "+canteen);
		System.out.println("Does Library exist: "+library);
		System.out.println("Courses: "+course);
		
		System.out.println("----------------------------------------");
		
		MedicalCollege medcollege = new MedicalCollege(19000,false,"Osmania",true,7);
		String collegeName1 =  medcollege.getName();
		int strength1 = medcollege.strength;
		boolean canteen1 = medcollege.doesCanteenExist();
		boolean library1 = medcollege.libraryExist;
		int branches = medcollege.branches();
		System.out.println("Medical college name: "+collegeName1);
		System.out.println("College Strength: "+strength1);
		System.out.println("Does canteen exist: "+canteen1);
		System.out.println("Does Library exist: "+library1);
		System.out.println("Courses: "+branches);
		
		
	}
}
