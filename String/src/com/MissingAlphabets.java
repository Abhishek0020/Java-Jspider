package com;

public class MissingAlphabets {
	public static void main(String[] args) {
		
		String input = "abc";  // Input string
        
        // Call method to find and print missing alphabets
        findMissingAlphabets(input);
    }

    // Method to find and print missing alphabets
    public static void findMissingAlphabets(String input) {
        // Convert input string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Find the first and last character in the input string
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);

        // Loop through the entire alphabet from firstChar to lastChar
        for (char ch = firstChar; ch <= lastChar; ch++) {
            // Check if the current character is in the input string
            if (input.indexOf(ch) == -1) {
                // Print the missing character
                System.out.print(ch + " ");
            }
        }

        // For remaining characters after the last character in the string
        for (char ch = (char)(lastChar + 1); ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
	}

}
