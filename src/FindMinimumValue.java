
public class FindMinimumValue {
public static void main(String[] args) {
	
	int num[]= {5000,50,1000,2000,26000};

	int min=num[0];
	
	for (int i = 1; i < num.length; i++) {
		
		if (num[i]<min) {
			
			min=num[i];
			
		}
		
	}
	
	System.out.println("The minimum value is :"+min);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

//int[] arr ={1,5,7,8,9}
//int max = 0, min =0;
//for (int i =0; i<arr.length,i++)
//{
//if(arr[i]>max)
//{
//max = arr[i];
//}
//elseif(arr[i]<min)
//{
//min= arr[i]
//}
//
//
//}
//Sout("Maximum value is" : max);
//Sout("Minimum value is" : min);

