public class MissingthesumArray {

	public static void main(String[] args) {

			
			int[] num= {1,2,3,5,6};
			int sum1=0;
			int sum2=0;
		
			for (int i = 0; i < num.length; i++) {
		
				sum1=sum1+num[i];
		
			}
		
			//System.out.println("Sum of element in array :" +sum1);
			 
			for (int i = 1; i <= 6; i++) {
				
				sum2=sum2+i;
						
			}
			
			//System.out.println("Sum of element in array :" +sum2);
		
			System.out.println("Missing element in array :" +(sum2-sum1));



//		int[] num = {1, 2,3, 4, 5,7};
//		
//		int n = 7; // The array should contain integers from 1 to n.
//		int SumofNumbers = n * (n + 1) / 2; // Calculate the expected sum of consecutive integers from 1 to n.
//        int Sum = 0;
//        
//        
//		for (int i = 0; i < num.length; i++) {
//			Sum = Sum+num[i];
//		}
//
//		int missingElement = SumofNumbers - Sum;
//		System.out.println("Missing element in the array: " + missingElement);
//




	}















}
