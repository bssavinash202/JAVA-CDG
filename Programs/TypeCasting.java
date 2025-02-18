class TypeCasting{

	public static void main(String args[]){
	
		//implicit casting from char to int
		char ch = 'A'; // 2bytes
		int num = ch;
		System.out.println(num);
		
		byte b = 10;
		short s = b;
		System.out.println(s); // byte==>short
		
		int i = s; //short ==> int
		System.out.println(i);
		
		long l = i; // int ==> long
		float f = l; // long ==> float
		System.out.println(l);
		System.out.println(f);
		
		// explicit casting
		double d1 = 123.4556;
		int i1 = (int)d1; //double ==> int
		System.out.println(i1); //123
		
		int largeNum = 130;
		byte by = (byte)largeNum;
		System.out.println(by);
		
	}
}