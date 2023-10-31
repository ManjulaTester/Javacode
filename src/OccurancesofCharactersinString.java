import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccurancesofCharactersinString {
	
	public static void main(String[] args) {
		
//		String input = "Java";
//		
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		char[] charArray = input.toCharArray();    //converted to character of array element
//		
//		for (char ch : charArray) {               //iteration for given characters
//			
//			if (!map.containsKey(ch)) {           //containskey method is used here
//				map.put(ch, 1);
//				
//			} else {
//				Integer count = map.get(ch);
//				map.put(ch, count+1);
//				
//			}
//			
//		}
		
		 int[] num = {1, 2, 1, 4, 2};
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		    for (int value : num) {
		        if (!map.containsKey(value)) {
		            map.put(value, 1);
		        } else {
		            Integer count = map.get(value);
		            map.put(value, count + 1);
		        }
		    }
	System.out.println(map);		
		
	
	
//		Set<Character> keySet = map.keySet();
//		for (Character ch : keySet) {
//			if (map.get(ch)>1) {
//				 System.out.println(ch + "-" + map.get(ch));
//				
//				
//			}
//		}
//		
		
		
		
		
		
		
		
		
	}	

}
