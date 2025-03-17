package firstjavaproject;

public class JumpingDemo {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
//			if(i==5) {
//				break;
//			}
//			if(i==5) {
//				continue;
//			}
			switch(i) {
			case 2:
			case 4:
				continue;
			}
			System.out.println(i);
		}

	}

}
