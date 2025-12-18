package com;

public class ReplaceWord {
	public static void main(String[] args) {
        String input = "I love python";  // Input string
        String wordToReplace = "python";  // Word to replace
        String replacementWord = "java";  // Word to replace with

        // Replace the word using the replace() method
        String output = input.replace(wordToReplace, replacementWord);

        // Print the modified string
        System.out.println(output);
    }

}
