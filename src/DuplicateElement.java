import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {
	
	
	public static void main(String[] args) {
		
		//duplicate element in string array
		
		String[] names = {"Java","Program","Java","language","data","Program"};
	
		
		//hashset
		
		Set<String> set = new HashSet<String>();
		Set<String> duplicateElements = new HashSet<String>();

		for (String element : names) { 
		    if (!set.add(element)) {       //add method
		        duplicateElements.add(element);
		    }
		}

		System.out.println("Duplicate elements are: " + duplicateElements);
		
		
	}
	
	
	
	
	
	
//	
//	    public static void main(String[] args) {
//	        String[] names = {"Java", "Program", "Java", "Language", "Data", "Program"};    //duplicate array of element
//
//	        Map<String, Integer> map = new HashMap<>();                  //store the element
//	        Map<String, Integer> duplicateElements = new HashMap<>();    //store the duplicate element 
//
//	        for (String element : names) {                               //iteration start from here                            //get method for iterate the element
//	            if (!map.containsKey(element)) {                                     //return if the element is not present in the map.
//	                map.put(element, 1);                                  //intial count is 1  in map
//	            } else {
//	            	Integer count = map.get(element);
//	                map.put(element, count + 1);                          //increment the count by 1 in map
//	            }
//	        }
//	        
//            System.out.println(map);
//	        Set<Entry<String,Integer>> entrySet = map.entrySet();         //entryset is method created with map
//	        for (Entry<String, Integer> entry : entrySet) {               //iteration start for entryset 
//	            if (entry.getValue() > 1) {                               //checking the value by greater than 1 to find the duplicate element
//	                duplicateElements.put(entry.getKey(), entry.getValue()); //added key-value pair to find the duplicate element
//	            }
//	        }
//
//	        System.out.println("Duplicate elements and their counts are: " + duplicateElements);
//	                                                                        //finally print the duplicate element from array
//	    
//	     
	    
	    
	    
	    
	    
	    
	    
	  //  }
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	


	
	
	
	
	
	
	
	
	
	
