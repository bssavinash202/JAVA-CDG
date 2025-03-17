package assigments2;

public class PrimeRange {

	public static void main(String[] args) {
		int range = 100;
		for(int i =2;i<=range;i++) {
			int count=0;
			for(int j =2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
				
				}
			if(count==0) {
				System.out.println(i);
			}
		}

	}

}
