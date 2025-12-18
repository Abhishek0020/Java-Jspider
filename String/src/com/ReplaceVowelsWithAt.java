package com;

public class ReplaceVowelsWithAt {
    // Function to replace vowels with '@' in a string
    public static String replaceVowelsWithAt(String input) {	
        // Convert the input string to a character array for manipulation	
        char[] chars = input.toCharArray();
        // Loop through each character     
        for (int i = 0; i < chars.length; i++) {       	
            // Check if the character is a vowel (both uppercase and lowercase)    	
            if (isVowel(chars[i])) {         	
                // Replace the vowel with '@'
                chars[i] = '@';
            }
        }
        // Convert the modified character array back to a string and return it
       return new String(chars);
    }
    // Helper function to check if a character is a vowel  
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Handle both lowercase and uppercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        // Example input
        String input = "Ramana";
        // Get the transformed output
        String output = replaceVowelsWithAt(input);
        // Print the results
        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }
}

