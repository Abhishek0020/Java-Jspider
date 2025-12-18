package com;

public class Reverseandadd {
	
	   
		    public static void main(String[] args) {
	        String input = "acb243d10";  // Input string

	        // Step 1: Extract numbers from the string
	        StringBuilder number1 = new StringBuilder();
	        StringBuilder number2 = new StringBuilder();
	        
	        boolean foundNumber1 = false;
	        
	        // Loop through the string and extract numbers
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isDigit(ch)) {
	                if (!foundNumber1) {
	                    number1.append(ch);  // Add to number1 until we encounter number2
	                } else {
	                    number2.append(ch);  // Add to number2 after number1 is found
	                }
	            } else {
	                if (number1.length() > 0 && number2.length() == 0) {
	                    foundNumber1 = true;  // After number1 is found, start collecting number2
	                }
	            }
	        }

	        // Step 2: Reverse the first number
	        String reversedNumber1 = number1.reverse().toString();  // This gives the reversed string
	        
	        // Step 3: Convert both numbers to integers
	        int num1 = Integer.parseInt(reversedNumber1);
	        int num2 = Integer.parseInt(number2.toString());

	        // Step 4: Perform the addition
	        int sum = num1 + num2;

	        // Step 5: Print the result in the desired format
	        System.out.println(reversedNumber1 + "+" + number2 + "=" + sum); // Output the result in the format
	    }
	}

	



