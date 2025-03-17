package assigments2;

public class SumOfPrime {

	public static void main(String[] args) {
		int range =10;
		int sum = 0;
		for(int i =2;i<=range;i++) {
			int count=0;
			for(int j =2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				sum+=i;
			}
		}
	System.out.println(sum);

	}

}
