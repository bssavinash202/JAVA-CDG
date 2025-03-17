package assigments;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		int ogNum = num;
		int strong=0;
		while(num!=0) {
			int fact = 1;
			int rem = num%10;
			for(int i=rem;i>=1;i--) {
				fact*=i;
			}
			strong=strong+fact;
			num=num/10;		
		}
		if(strong==ogNum) {
			System.out.println(strong+ " is a Strong Number");
		}else System.out.println(strong+ " is not a Strong Number");
		
			
	}

}
