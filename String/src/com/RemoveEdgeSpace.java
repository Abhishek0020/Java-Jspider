package com;

public class RemoveEdgeSpace {
    public static void main(String[] args) {
        String input = "__java _is _easy__";  // Input string
        
        // Step 1: Trim the input string to remove leading and trailing spaces
        String trimmedInput = input.trim();
        
        // Step 2: Replace multiple spaces between words with a single space
        String result = trimmedInput.replaceAll("\\s+", " ");
        
        // Step 3: Print the result
        System.out.println("Output: \"" + result + "\"");
    }
}

