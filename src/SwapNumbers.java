
public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		
//		int temp;
//		temp=a;                      //method :1
//		a=b;
//		b=temp;
//		
		
		a=a-b;
		b=a+b;                        //method :2
		a=b-a;
			
		System.out.println("After swapping");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
		
		
		
		
	
		
	}

}
