package com;

public class Anagram {
    
    public static void main(String[] args) {
        // Testing the function
        System.out.println(isAnagram("qlitsen", "silent"));
    }

    static boolean isAnagram(String s1, String s2) {
        // Convert both strings to lowerCase to handle case-insensitivity
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Infinite loop issue
        while (true) {
            if (s1.length() != s2.length()) 
                // If the lengths are not the same, they cannot be anagrams
                return false;
            else if (s1.length() == 0 && s2.length() == 0) 
                // If both strings are empty, they are anagrams
                return true;
            
            char ch = s1.charAt(0);
            s1 = s1.replace(ch + "", "");
            s2 = s2.replace(ch + "", "");
        }
    }
}
