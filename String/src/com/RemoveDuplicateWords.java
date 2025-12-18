package com;
public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "happy happy birthday";
        
        // Split the string into words
        String[] words = input.split(" ");
        
        // Initialize an empty string to hold the result
        String result = "";
        
        // Iterate through each word in the input string
        for (String word : words) {
            // Check if the word is already present in the result string
            if (!result.contains(word)) {
                // If it's not present, add it to the result string
                result += word + " ";
            }
        }
        
        // Remove the trailing space from the result string
        result = result.trim();
        
        // Print the result
        System.out.println(result);
    }
}
