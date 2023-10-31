
public class RemoveSpecialCharacters {
	
	public static void main(String[] args)   
	{  
	//declare a string having special characters   
	String str="Pr!ogr#am%m*in&g Lan?#guag(e1234";  
//	String resultStr="";  
//	//loop execute till the length of the string   
//	for (int i=0;i<str.length();i++)  
//	{  
//	//comparing alphabets with their corresponding ASCII value  
//	if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true  
//	{  
//	//adding characters into empty string   
//	resultStr=resultStr+str.charAt(i);  
//	}  
//	}  
//	System.out.println("String after removing special characters: "+resultStr);  
//	}  
	
	String alphabets = "";
    String digits = "";
    String specialChars = "";

    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);

        if (Character.isLetter(currentChar)) {
            alphabets += currentChar;
        } else if (Character.isDigit(currentChar)) {
           // digits += currentChar;
        	digits += currentChar;
        } else {
            specialChars += currentChar;
        }
    }

    System.out.println("Alphabets: " + alphabets);
    System.out.println("Digits: " + digits);
    System.out.println("Special Characters: " + specialChars);
    
    //int parseInt = Integer.parseInt(str);
    
    
    
    
}







	
	
	
	
	
	
	
	
	
	
	
	
}





