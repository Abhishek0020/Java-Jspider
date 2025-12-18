package com;

public class CharacterFreq {
	public static void main(String[] args) {
		 String input = "helloworld";  // Input string
	        String result = "";

	        // Loop through each character in the string
	        
	        for (int i = 0; i < input.length(); i++) 
	        {
	            char currentChar = input.charAt(i);
	            
	            // Count occurrences of the current character in the string
	            int count = 0;
	            for (int j = 0; j < input.length(); j++)
	            {
	                if (input.charAt(j) == currentChar) 
	                {
	                    count++;
	                }
	            }   
	            // If the current character hasn't been added to the result string yet
	            if (result.indexOf(String.valueOf(currentChar)) == -1) 
	            {
	                // Append the character and its count if it's more than 1
	                if (count > 1) 
	                
	                {
	                    result += currentChar + String.valueOf(count);
	                } 
	                else 
	                {
	                    result += currentChar;  // If the count is 1, just add the character
	                }
	            }
	        }
	        
	        // Output the result
	        System.out.println(result);
	}
}
