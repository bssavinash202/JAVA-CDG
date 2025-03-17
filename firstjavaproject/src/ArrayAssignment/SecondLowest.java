package ArrayAssignment;

public class SecondLowest {

	public static void main(String[] args) {
		int arr[]= {87,98,65,90,76,99,87};
		Secondlowest(arr);

	}
	public static void Secondlowest(int[] arr) {
		for(int num: arr) 
			System.out.print(num+" ");
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		  }
		System.out.println("");
		System.out.println("Second Lowest: "+arr[arr.length-2]);
	}

}
