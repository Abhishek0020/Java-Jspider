package com;

public class CharacterOccurrencwithTargetchar {
	public static void main(String[] args) {
		String str = "programming is fun";  // Example input string
        char targetChar = 'g';             // Character to find occurrence

        // Call method to find the occurrence of the target character
        int occurrenceCount = findCharacterOccurrence(str, targetChar);
        
        // Print the result
        System.out.println("The character '" + targetChar + "' occurs " + occurrenceCount + " times in the string.");
    }

    // Method to find the occurrence of a character using the replace method
    public static int findCharacterOccurrence(String str, char targetChar) {
        // Convert the target character to a string
        String targetString = String.valueOf(targetChar);

 // Replace the target character with an empty string and calculate the difference in lengths
        String modifiedString = str.replace(targetString, "");
        
        // The difference in length gives the number of occurrences
        int occurrences = (str.length() - modifiedString.length()) / targetString.length();
        
        return occurrences;
	}

}
