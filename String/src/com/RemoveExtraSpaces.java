package com;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String input = "java__is___very__easy__";  // Input string with extra spaces
        
        // Step 1: Initialize a StringBuilder to build the final result
        StringBuilder result = new StringBuilder();
        
        // Step 2: Initialize a flag to check if the previous character was a space
        boolean lastCharWasSpace = false;
        
        // Step 3: Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Step 4: If the current character is a space, check if the last character was also a space
            if (currentChar == ' ') {
                if (!lastCharWasSpace) {
                    result.append('_');  // Add an underscore between words instead of spaces
                }
                lastCharWasSpace = true;  // Set the flag to true because the current character is a space
            } else {
                result.append(currentChar);  // Append the current non-space character
                lastCharWasSpace = false;  // Reset the flag because we encountered a non-space character
            }
        }
        
        // Step 5: Print the result
        System.out.println("Output: \"" + result.toString() + "\"");
    }
}
