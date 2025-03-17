package assigments;

public class CountPrime {

	public static void main(String[] args) {
		int max = 8;
		int primeCounter = 0;
		
		for(int min=2;min<=max;min++) {
			int count = 0;
			for(int j=2;j<min;j++) {
				if(min%j==0) {
					count++;
				}
			}
			if(count==0) {
				primeCounter++;
			}
		}
		System.out.println(primeCounter);

	}

}
