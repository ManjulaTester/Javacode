
public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		
		
		String input = " Java Program ";
		String output="";
		
		for (int i = 0; i <input.length(); i++) {
			char c = input.charAt(i);
			
		
		
		if (!Character.isWhitespace(c)) {
			 output+=c;
			
		}
		
		
		}
	
		System.out.println(output);	
		
	}

}
