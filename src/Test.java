import java.util.Scanner;

public class Test {
	
	public static double getAmount() {
		
	
	String s="";
	String str = new String("automation");
	char[] ch = s.toCharArray();
	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("Enter a String : ");
//	 str = sc.nextLine();
	
	for (int i = 0; i < ch.length; i++) {
		char c = ch[i];
		
		if (c>=0 && c<=9) {
			
			s=s+c;
				
			
		}
		
	}
	
	double amount = Double.parseDouble(s);
	
	
	return 0;
	
	
		
	
}
	
	public static void main(String[] args) {
		double amount = getAmount();
		System.out.println("Enter the String is: " +amount);
		
		
		
	}
}