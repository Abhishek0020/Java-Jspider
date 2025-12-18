package com;

public class OccurrenceOfChar {
    public static void main(String[] args) {
        String s = "java is easy";  // input string
        char[] ch = s.toCharArray(); // convert string to char array

        // Loop through each character
        for (int i = 0; i < ch.length; i++)
        {
            // Skip space characters and already counted characters
            if (ch[i] == ' ' || ch[i] == '\u0000') 
            {
                continue;
            }

            int count = 1;  // initial count for the current character

            // Loop through the remaining characters to count occurrences
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;          // increment count for matching character
                    ch[j] = '\u0000'; // mark the character as counted
                }
            }
            // Print the character and its count
            System.out.println(ch[i] + "=" + count);
        }
    }
}
