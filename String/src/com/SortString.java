package com;
import java.util.*;
public class SortString {
	public static void main(String[] args) {
		String input = "ccaabbd";  // Input string

        // Call method to sort the string
        String result = sortString(input);

        // Print the result
        System.out.println(result);
    }

    // Method to sort the characters of the string
    public static String sortString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted character array back to a string and return
        return new String(charArray);
	}

}
