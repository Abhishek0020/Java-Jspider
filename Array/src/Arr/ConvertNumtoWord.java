package Arr;

public class ConvertNumtoWord {
	public static void main(String[] args) {
		int number = 123;

        // Convert number to string to access digits
        String numStr = String.valueOf(number);

        // Array to map digits to words
        String[] words = {
            "Zero", "One", "Two", "Three", "Four", 
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        System.out.print("Number in words: ");
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0'; // convert char to int
            System.out.print(words[digit] + " ");
        }
	}

}
