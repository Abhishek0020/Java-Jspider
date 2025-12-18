package com;

public class MaxOccur {

	public static void main(String[] args) {
	   String input = "ramana";  // Input string
        
        // Initialize variables to track the character with the maximum occurrence
        char maxChar = ' ';
        int maxCount = 0;
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
          // If the count of currentChar is higher than maxCount, update maxChar and maxCount
            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }
        // Output the character with the maximum count
        System.out.println(maxChar + "=" + maxCount);
	}
}
