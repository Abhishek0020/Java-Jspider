package com;

public class StringToASCII {
    public static void main(String[] args) {
        String input = "abc";  // Input string
        
        // Initialize variables to store the sum and output expression
        int sum = 0;
        StringBuilder output = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int asciiValue = (int) ch;  // Get ASCII value of the character
            sum += asciiValue;  // Add to the sum

            // Append the ASCII value to the output expression
            if (i != 0) {
                output.append("+");  // Add "+" between numbers
            }
            output.append(asciiValue);  // Append the ASCII value
        }

        // Print the output in the format: "97+98+99=294"
        output.append("=" + sum);
        System.out.println(output);
    }
}
