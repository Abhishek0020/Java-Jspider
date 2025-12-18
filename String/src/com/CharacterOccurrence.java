package com;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "java is easy"; 
        char targetChar = 'a';  

        int originalLength = input.length();
       
        String modifiedString = input.replace(String.valueOf(targetChar), ""); 
        int modifiedLength = modifiedString.length();
        int occurrences = (originalLength - modifiedLength);
        // Step 5: Print the result
   System.out.println("The character '" + targetChar + "' occurs " + occurrences + " times.");
    }
}

