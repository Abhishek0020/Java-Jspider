package com;

public class Missing_vowel {
    public static void main(String[] args) {
        String input = "india";
        System.out.println("Missing vowels: " + findMissingVowels(input));
    }

    public static String findMissingVowels(String s) {
        // Define a string with all vowels in both lowercase and uppercase
        String vowels = "aeiouAEIOU";
        
        // Convert the input string to lowercase to make comparison easier
        s = s.toLowerCase();

        // Initialize an empty string to collect missing vowels
        String missingVowels = "";
        
        // Loop through all vowels and check if they are missing in the input string
        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);
            if (!s.contains(String.valueOf(vowel))) 
            {
                missingVowels += vowel;  // Concatenate the missing vowel to the result string
            }
        }  
        return missingVowels;
    }
}

