

public class SecondHighestNumberInArray {

	public static void main(String[] args) {

		int[] arr= {100,14,15,19,20,500,90,150,200,250,240};

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest)
			{
				secondLargest = arr[i];
			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("Largest Number is: "  +largest);

	}













}
