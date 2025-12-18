package com;

public class MinOccur {
	public static void main(String[] args) {
		 String input = "ramana";  // Input string
	        
	        // Initialize variables to track the character with the minimum occurrence
	        char minChar = ' ';
	        int minCount = Integer.MAX_VALUE;
	        
	        // Loop through each character in the string
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            int count = 0;
	            
	            // Loop through the rest of the string to count occurrences of currentChar
	            for (int j = 0; j < input.length(); j++) {
	                if (input.charAt(j) == currentChar) {
	                    count++;
	                }
	            }
	            
	            // If the count of currentChar is less than minCount, update minChar and minCount
	            if (count < minCount && count > 0) {
	                minCount = count;
	                minChar = currentChar;
	            }
	        }
	        
	        // Output the character with the minimum count
	        System.out.println(minChar + "=" + minCount);
	}

}
