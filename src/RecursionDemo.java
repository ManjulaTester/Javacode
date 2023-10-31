
public class RecursionDemo {
	
	public static void main(String[] args) {
		
		recursionPrint(10);
		
		
		
	}
	
	public static void recursionPrint(int number) {
		
		if (number>0) {
			
			recursionPrint(number-1);
			
			System.out.println(number);
		}
		
	}

}
