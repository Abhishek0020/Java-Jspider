package com;

public class StringPermutations {
	public static void main(String[] args) {
		String str = "abc";
        // Calling the function to print permutations
        generatePermutations(str, 0, str.length() - 1);
    }
    
    // Method to generate permutations of the string
    public static void generatePermutations(String str, int left, int right) {
        // If left index is equal to the right index, the string is a valid permutation
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                // Swap the current index with the left index
                str = swap(str, left, i);
                
                // Recur for the remaining substring
                generatePermutations(str, left + 1, right);
                
                // Backtrack: undo the swap
                str = swap(str, left, i);
            }
        }
    }
    
    // Utility method to swap characters at two positions
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
	}

}
