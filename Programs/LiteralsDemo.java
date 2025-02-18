
class LiteralsDemo{
	
	public static void main(String args[]){
	
		int octalNumber = 010; //  010 = 1*8^1+0*8^0
		System.out.println("Octal Number is: "+octalNumber);
		//int x = 0898;
		//System.out.println(x); throws error because 0898 is out of range for 0-7
		
		int hexaNum = 0x1A;
		System.out.println("Hexa Decimal Number is: "+hexaNum);
		
		//1*16^1 + 10*16^0
		
		int binNum = 0b1010;
		System.out.println("Binary Number is: "+binNum);
	
		int number = 10;
		long longNumber = number; // Casting of int to long ==> Type casting
	}
}