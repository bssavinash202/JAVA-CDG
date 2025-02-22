class OperatorTest{
	public static void main(String[] args){
	
	int x = 0;
	int y = 0;
	System.out.println("Logical Operators &&");
	boolean result1 = (++x>0 && ++y>0);
	System.out.println(result1);
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
	//reseting the x and y
	x=0; y=0;

	boolean result2 = (++x<0 && ++y>0);
	System.out.println(result2);
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
	
	
	System.out.println("***************************");
	
	System.out.println("Boolean Operators &");
	x=0; y=0;
	boolean result3 = (++x>0 & ++y>0);
	System.out.println(result3);
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
	
	System.out.println("Boolean Operators &");
	x=0; y=0;
	boolean result4 = (++x<0 & ++y>0);
	System.out.println(result4);//false
	System.out.println("X: "+x);//1
	System.out.println("Y: "+y);//1
	
	}


}