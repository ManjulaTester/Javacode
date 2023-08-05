
public class loop {

	public static void main(String[] args) {
		
		
		int col = 1, rows = 6;
		
		for (int i = 0; i < rows; i++) {
			
			for (int space = 1; space < rows-i ; ++space) {
				System.out.print(" ");
			}
	
		
		for (int j = 0; j <= i; j++) {
			if (j == 0|| i == 9) {
				col = 1;
				
			} else {

				col= col *(i-j+1)/j;
				System.out.print(col);
			}
			System.out.println();
		}
		
		
		
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
	
}
