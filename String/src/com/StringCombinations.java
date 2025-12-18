package com;

public class StringCombinations {
    public static void main(String[] args) {
        String str = "abc";
        // Generate all combinations of the string
        generateCombinations(str, "", 0);
    }
    // Method to generate all combinations of the string
    public static void generateCombinations(String str, String current, int index) {
        // Base case: When index reaches the length of the string, return
        if (index == str.length()) {
            if (!current.isEmpty())
            {
                System.out.println(current);  // Print the combination
            }
            return;
        }

        // Include the current character in the combination
        generateCombinations(str, current + str.charAt(index), index + 1);
        
        // Exclude the current character from the combination
        generateCombinations(str, current, index + 1);
    }
}

