package toChar;

public class MaxOccured {
    public static void main(String[] args) {
        String s = "jaaaaava";

        // Convert the string to a character array
        char[] chars = s.toCharArray();

        // Create an array to store the frequency of characters (assuming ASCII characters)
        int[] frequency = new int[256];  // We use 256 to cover all ASCII characters

        
        // Count the frequency of each character
        for (int i = 0; i < chars.length; i++) {
            frequency[chars[i]]++;
        }

        // Find the maximum frequency and the corresponding character
        int maxCount = 0;

        
        char maxChar = '\u0000';  // Initialize to null character
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
               
            }
        }

        // Print the result in the desired format
        System.out.println(maxChar + "=" + maxCount);
    }
}

