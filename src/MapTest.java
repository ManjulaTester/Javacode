import java.util.HashMap;
import java.util.Map;

public class MapTest<Static> {
	
	
	private static final String CommonUtility = null;
	static int amount;
	static String card;
   static Map<String,Integer> mp= null;
   
   public static Map<String, Integer> setMap(String card, Integer amount) {

	if(mp == null) {
		
		mp= new HashMap<String, Integer>();
		
	}
	
	if (mp.get(card)!= null) {
		
		Integer map = mp.put(card, mp.get(card)+ amount);
	 
	} else {
		
		mp.put(card, amount);

	}
	return mp;
	
	
   }
	
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> mp=setMap("mastercard", 1000);
		System.out.println(mp);
		
		//MapTest.setMap(card, null);
		
	}
	
	
	
	
	
	
	
	

}
