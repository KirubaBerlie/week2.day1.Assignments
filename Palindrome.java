package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		
		String inputText = "madam";
		String rev="";
		
		for (int i=inputText.length(); i > 0; i-- )
					
			rev= rev+ inputText.charAt(i-1);
			
		
		if (inputText.equals(rev))
			
			System.out.println( rev+ " is Palindrome");
		else
			System.out.println( inputText + " is NOT Palindrome");
		
	}
	

}
