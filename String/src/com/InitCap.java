package com;

public class InitCap {
public static void main(String[] args) {
	 String input = "india that is bharat";  // Input string

     // Convert the input string to InitCap format
     String result = initCap(input);

     // Print the result
     System.out.println(result);
 }

 // Method to convert a string to InitCap format without using StringBuilder or StringBuffer
 public static String initCap(String input) {
	 
     // Split the string into words based on space
     String[] words = input.split(" ");
     
     // Initialize an empty result string
     String result = "";
     
     // Loop through each word
     for (String word : words) {
         // Capitalize the first letter and make the rest lowercase
         String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
         
         // Concatenate the capitalized word and a space to the result string
         result += capitalizedWord + " ";
     }
     
     // Trim the trailing space and return the result
     return result.trim();
}
}
