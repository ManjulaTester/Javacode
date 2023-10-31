import java.util.Arrays;

public class WithoutUsingForloop {
	
	    public static void main(String[] args) {
	        int[] numbers = Arrays.stream(new int[100]).map(i -> i + 1).toArray();
	        for (int number : numbers) {
	            System.out.println(number);
	        }
	    }
	}

