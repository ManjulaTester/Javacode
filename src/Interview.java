import java.util.HashSet;
import java.util.Set;

public class Interview {
	public static void main(String[] args) {
		
		String input = "abcHelloabcrainabcstop";

        Set<String> set = new HashSet<>();
        Set<String> duplicateStrings = new HashSet<>();

        for (int i = 0; i < input.length()-2; i++) {
            String substring = input.substring(i, i + 3); // Get a substring of length 3
           // System.out.println(substring);
            if (!set.add(substring)) { // If it's not added to the set, it's a duplicate
                duplicateStrings.add(substring);
            }
        }

        System.out.println("Repetative strings are: " + duplicateStrings);
			
			
			
		}


}

