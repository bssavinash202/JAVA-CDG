
package assigment3;
public class NeonNumber {

	public static void main(String[] args) {
		
		  int num = 9; int sqr = num*num;int temp = num; int sum = 0; 
		  while(sqr!=0) {
		  int digit = sqr%10; sum+=digit; sqr/=10; 
		  } 
		  if(temp==sum) {
		  System.out.println(temp+" is a Neon Number"); 
		  }
		  else
		  System.out.println(temp+" is not a Neon Number");
		 
		
	}

}
