
public class ReversenumberbyArray {


	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		//For string
//		String str = "Helloworld";
//		char[] charArray = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			// Swap elements at left and right indices
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		for (int num : arr) {
			System.out.print(num + " ");

		}


	}
}




