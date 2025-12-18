package com;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "Hello World Java";  // Input string with spaces
        String result = "";  // String to hold the result (without spaces)
        
        // Step 1: Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the character at the current index
            // Step 2: Check if the character is not a space
            if (ch != ' ') {
                result += ch;  // Append non-space characters to the result string
            }
        }
        
        // Step 3: Print the result string (without spaces)
        System.out.println("Original String: " + input);
        System.out.println("String without spaces: " + result);
    }
}
