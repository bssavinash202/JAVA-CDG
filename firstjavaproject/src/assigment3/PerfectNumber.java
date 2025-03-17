package assigment3;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 8;
		int temp = num;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
				System.out.println("Factors for "+num+" is "+i);
			}
		}
		if(sum==temp) {
			System.out.println(temp+" is a Perfect Number");
		}else System.out.println(temp+" is not a Perfect Number");
		

	}

}
