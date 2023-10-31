import java.util.Iterator;

public class fibonnaciSeries {

	
	//public static void main(String[] args) {
		
		//int num = 10;
//		int t1 = 0;
//		int t2 = 1;
//		
//		for (int i = 0; i <10; i++) {
//			
//			System.out.println(t1);
//			int sum =t1+t2;
//			t1=t2;
//			t2=sum;
		public static int fib(int n)
	    {
		if (n <= 1)  /// o and 1 term will call and return
            return n;
 
        // Recursive call
        return fib(n - 1) + fib(n - 2);  // greater than 1 will call here recursive starts
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;
 
        // Print the first N numbers
        for (int i = 0; i < N; i++) {
 
            System.out.println(fib(i));
        }
        
			
			
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
