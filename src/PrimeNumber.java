
public class PrimeNumber {
    public static void main(String[] args) {
        int[] num = {12, 11};  /// array declaration
        
        for (int no : num) {
            boolean isPrimeNumber = false;
            
            for (int i = 2; i <= no/2; i++) {
                if (no % i == 0) {
                	isPrimeNumber = true;
                    break;
                }
            }
            
           // System.out.print(no + " ");
            
            if (!isPrimeNumber) {
                System.out.println(no + " a prime number");
            } else {
                System.out.println(no + " not a prime number");
            }
        }
    }
}
 














