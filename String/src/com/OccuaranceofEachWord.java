package com;

public class OccuaranceofEachWord {
	public static void main(String[] args) {
		
		 String input = "Banglore is a Banglore city";
	        
	        // Convert the input string into an array of words
	        String[] words = input.split(" ");
	        
	        // Loop through each word in the array
	        for (int i = 0; i < words.length; i++) {
	            int count = 1; // Set initial count for each word
	            
	            // Check if the word has already been counted
	            if (words[i] != null) {
	            	
	                // Loop through the remaining words and count duplicates
	                for (int j = i + 1; j < words.length; j++) {
	                    if (words[i].equals(words[j])) {
	                        count++;
	                        words[j] = null; // Mark this word as counted
	                    }
	                }
	                // Print the word and its count
	                System.out.print(words[i] + "=" + count + "\n");
	            }
	        }
	}
}
