package com;

public class SmallestPalindromeSubstring {

    public static void main(String[] args) {
        String str = "babad";
        // Call method to find smallest palindrome substring
        String result = smallestPalindromeSubstring(str);
        System.out.println("Smallest palindrome substring: " + result);
    }

    // Method to find the smallest palindrome substring
    public static String smallestPalindromeSubstring(String str) {
        int n = str.length();
        String smallestPalindrome = str;  // Initially, set the smallest palindrome to the whole string

        // Loop through all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);

                // Check if the substring is a palindrome and its length is greater than 1
                if (isPalindrome(substring) && substring.length() > 1) {
                    // Update smallest palindrome if the current palindrome is smaller
                    if (substring.length() < smallestPalindrome.length()) {
                        smallestPalindrome = substring;
                        
                    }
                }
            }
        }

        // If no palindrome substring is found, return a single character (the first character)
        return smallestPalindrome.equals(str) ? String.valueOf(str.charAt(0)) : smallestPalindrome;
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        // Check characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

