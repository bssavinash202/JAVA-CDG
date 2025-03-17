package assigments;

public class Armstrong {

	public static void main(String[] args) {
		int num =378;
		int ogNum=num;
		int arm = 0;
		while(num!=0) {
			int rem  = num%10;
			arm= arm+(rem*rem*rem);
			num/=10;
		}
		if(arm==ogNum) {
			System.out.println(ogNum+ " is an Armstrong Number");
		}else {
			System.out.println(ogNum+ " is not an Armstrong Number");
		}
	}

}
