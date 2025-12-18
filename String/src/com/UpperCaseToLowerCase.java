package com;

public class UpperCaseToLowerCase {
	public static void main(String[] args) {
        String input = "Ramana";  // Input string

        // Loop to print progressively growing substrings
        for (int i = 1; i <= input.length(); i++) {
            // Get the substring from index 0 to i (exclusive)
            String substring = input.substring(0, i);

            // Convert the substring to lowercase
            System.out.println(substring.toLowerCase());
        }
    }

}
