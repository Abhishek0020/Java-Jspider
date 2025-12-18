package com;

public class MissingAlphabet {
    public static void main(String[] args) {
        String input = "acb243d10";  // Input string (can include numbers or special characters)
        
        // Step 1: Create a string of all lowercase alphabets
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Step 2: Loop through each letter of the alphabet and check if it's present in the input string
        StringBuilder missingAlphabets = new StringBuilder();
        
        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            
            // Step 3: Use indexOf to check if the character is in the input string
            if (input.indexOf(currentChar) == -1) {
                missingAlphabets.append(currentChar);  // Append missing character to result
            }
        }
        
        // Step 4: Print the missing characters
        System.out.println("Missing alphabets: " + missingAlphabets.toString());
    }
}

