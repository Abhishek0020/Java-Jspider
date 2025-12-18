package com;

public class ReplaceVowels {
    public static void main(String[] args) {
        String input = "abeijho";  // Input string
        String vowels = "aeiouAEIOU";  // List of vowels (both lowercase and uppercase)
        
        // Step 1: Count the number of vowels in the input string
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {  // Check if the character is a vowel
                vowelCount++;
            }
        }
        
        // Step 2: If the vowel count is greater than 3, replace all vowels with spaces
        if (vowelCount > 3) {
            input = input.replaceAll("[aeiouAEIOU]", " ");
        }
        
        // Step 3: Print the resulting string
        System.out.println("Output: \"" + input + "\"");
    }
}


