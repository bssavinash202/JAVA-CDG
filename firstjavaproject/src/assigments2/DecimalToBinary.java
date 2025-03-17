package assigments2;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal =8;
		String binary = "";
		if(decimal==0) {
			binary = "0";
		}else {
			while(decimal>0) {
				int rem = decimal%2;
				binary=rem+binary;
				decimal/=2;
			}
		System.out.println(binary);
		}

	}

}
