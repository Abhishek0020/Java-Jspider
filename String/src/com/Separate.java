package com;



public class Separate {
    public static void main(String[] args) {
        String s = "56a@bc123";
        
        // Print letters
        System.out.print("o/p1-->");
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print(ch + "");  // Print letters with space
            }
            
        }
        
        // Print digits
        System.out.print("\no/p2-->");
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.print(ch + "");  // Print digits with space
            }
        }
    }
}


