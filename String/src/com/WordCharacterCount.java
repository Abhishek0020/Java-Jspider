package com;

public class WordCharacterCount {
    public static void main(String[] args) {
        String input = "java is easy";  // Input string
        
        // Step 1: Split the input string into words using space as delimiter
        String[] words = input.split(" ");
        
        // Step 2: Loop through each word and print the word along with its length
        for (String word : words) {
            System.out.println(word + "=" + word.length());
        }
    }
}
