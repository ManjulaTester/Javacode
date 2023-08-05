
public class MissingthesumArray {
	
	public static void main(String[] args) {
		
	
	int[] num= {1,2,5,8,9};
	int sum1=0;
	int sum2=0;

	for (int i = 0; i < num.length; i++) {

		sum1=sum1+num[i];

	}

	System.out.println("Sum of element in array :" +sum1);


	for (int i = 0; i<10; i++) {

		sum2=sum2+i;

	}

	System.out.println("Sum of element in array :" +sum2);

	System.out.println("Missing element in array :" +(sum2-sum1));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
