package com;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "ramana";  // Input string
        String result = "";  // To hold the result without duplicates
        
        // Step 1: Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the current character
            
            // Step 2: Check if the character is already in the result string
            if (result.indexOf(ch) == -1) {  // indexOf returns -1 if the character is not found
                result += ch;  // Append the character to the result string
            }
        }
        
        // Step 3: Print the result string
        System.out.println("Output: " + result);
    }
}

