import java.util.HashMap;
import java.util.Map;

public class ReverseString {
	
	
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        
	        // Using StringBuilder
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        String reversedString = sb.toString();
	        System.out.println(reversedString);
	        
	        // Using StringBuffer 
	        StringBuffer sf = new StringBuffer(str);
	        sf.reverse();
	        reversedString = sf.toString();
	        System.out.println(reversedString);
	        
	        
	        
	        
	    
	    
	    //hashmap
	    
	    
	 
	            String str1 = "Hello, World!";
	            String reversedString1 = reverseString(str1);
	            System.out.println(reversedString1);
	        }

	        public static String reverseString(String str) {
	            Map<Integer, Character> map = new HashMap<>();
	            StringBuilder reversed = new StringBuilder();
	            int index = 0;

	            for (int i = str.length() - 1; i >= 0; i--) {
	                map.put(index++, str.charAt(i));
	            }

	            for (int i = 0; i < str.length(); i++) {
	                reversed.append(map.get(i));
	            }

	            return reversed.toString();
	       

	    
	    
	    
	    
	    
	    
	        }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}



