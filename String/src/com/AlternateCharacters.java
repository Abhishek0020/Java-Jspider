package com;

public class AlternateCharacters {
	public static void main(String[] args) {
		String input = "ramana";  // Input string

        // Call method to print alternate characters
        printAlternateCharacters(input);
    }

    // Method to print alternate characters from the string
	public static void printAlternateCharacters(String input) {
		
		for(int i=0;i<input.length();i+=2) {
			System.out.print(input.charAt(i));
		}
	}
 

}
