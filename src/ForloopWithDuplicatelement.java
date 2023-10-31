
public class ForloopWithDuplicatelement {
	
	public static void main(String[] args) {
		
		int [] arr= {1,3,5,1,10,3,0};
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println("Duplicate element are : " + arr[i]);
			}
			
		}
		}
		
		
		
		
		
		
		
	
		
	}

}
