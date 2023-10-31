
public class PalindromeNumber {
	
	
	public static void main(String[] args) {
		
		int num = 121;	
		int rev = 0;
		int ActualRev = num;
		
		while (num!=0) {
			
		
			rev= rev *10 + num % 10; 
			num = num/10;	
			
			
		}
		
		System.out.println(rev);
		
		
		if (ActualRev==rev) {
			System.out.println(rev+ " is Palindrome");
		} else {
			System.out.println(rev+ " is not Palindrome");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
