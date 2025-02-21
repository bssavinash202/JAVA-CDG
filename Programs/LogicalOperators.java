class LogicalOperators{
	public static void main(String[] args){
		//int x = 5;
		//int y = 10;
			//Logical AND
		//boolean result = (x>0 && y>5);
		//System.out.println("Logical AND: "+result );// true
			//Logical OR
		//boolean result1 = (x>10 || y>5);
		//System.out.println("Logical OR: "+result1 );// true
			//Logical NOT
		//boolean result2 = !(x>y);
		//System.out.println("Logical NOT: "+result2 );// true
		int x = 0;
		int y = 0;
		boolean result = (++x>0 || ++y>0);
		System.out.println(result);	
		System.out.println(x);
		System.out.println(y);
	}
}