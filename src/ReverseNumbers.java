
public class ReverseNumbers {
	
	
	public static void main(String[] args) {
		
		
		int num = 1234;	
		int rev = 0;
		
		
		while (num!=0) {
			 
			rev= rev*10 + num%10;   //4321
			num=num/10;         //when it reached 0 loop will terminate
		
			
		}
		
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
	}

}
