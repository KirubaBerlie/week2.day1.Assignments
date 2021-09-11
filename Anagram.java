package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = ""; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length() == text2.length())
		{
			char[] chArr1 = text1.toCharArray();
			char[] chArr2 = text2.toCharArray();
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			boolean same = false;
			
		  for(int i=0;i< chArr1.length;i++)
		  {  
			 if(chArr1[i]== chArr2[i])
			 {
				 same = true;
			 }
			 else
			 {
				 same= false;
				 break;}
				
		  }
			if(same)
				System.out.println("Both arrays are same: It is Anagram");
			else
				System.out.println("Both arrays are NOT same:NOT Anagram");
			
		}
			
	}

}
