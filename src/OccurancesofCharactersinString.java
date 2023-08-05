import java.util.HashMap;
import java.util.Map;

public class OccurancesofCharactersinString {
	
	public static void main(String[] args) {
		
		String input = "HelloWorld";
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] charArray = input.toCharArray();    //converted to character of array element
		
		for (char ch : charArray) {               //iteration for given characters
			
			if (!map.containsKey(ch)) {           //containskey method is used here
				map.put(ch, 1);
				
			} else {
				Integer count = map.get(ch);
				map.put(ch, count+1);
				
			}
			
		}
		
		System.out.println(map);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
