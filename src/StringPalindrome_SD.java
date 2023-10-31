import java.util.Scanner;

public class StringPalindrome_SD {
	
	public static void main(String[] args) {
		
		String str;
		String rev="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		 str = sc.nextLine();
		 
		 
		 int length = str.length();
		 
		 for (int i = length-1; i >=0; i--) {
			 
			 rev= rev+str.charAt(i);
			 
			
		}
		 
		if (str.equals(rev)) {
			
			System.out.println(rev + "It is palindrome");
			
		} else {

			System.out.println(rev + "It is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
