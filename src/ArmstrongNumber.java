
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num =153;
		int Actualnum = num;
		double result= 0;
		
		while (Actualnum!=0) {
			
			int n = Actualnum %10;
			result= result + Math.pow(n, 3);
			Actualnum = Actualnum/10;
			
			
		}
		
		if (result==num) {
			System.out.println(num + " is an Armstrong number ");
			
		}
		else {
			System.out.println(num + " is not an Armstrong number ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
