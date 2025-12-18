package com;

public class Substrings {
	public static void main(String[] args) {
		String input = "Malayalam";  // Input string

        // Call method to print substrings
        printSubstrings(input);
    }

    // Method to print substrings with a length of 3 or more
    public static void printSubstrings(String input) {
        // Loop through the string to get the starting index
        for (int i = 0; i < input.length(); i++) {
            // Loop to get substrings of length 3 or more
            for (int j = i + 3; j <= input.length(); j++) {
                // Print the substring starting from index i to j
                System.out.println(input.substring(i, j));
            }
        }
	}

}
