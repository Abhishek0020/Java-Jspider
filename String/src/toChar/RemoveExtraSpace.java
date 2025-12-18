package toChar;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String inputString = "java____is__easy";

        // Convert the string to a character array
        char[] chars = inputString.toCharArray();

        // Result array to store the modified string (with extra underscores removed)
        char[] result = new char[chars.length];
        int resultIndex = 0;  // To track where to store characters in result
        boolean inUnderscore = false; // Flag to track if the previous character was an underscore

        // Loop through the character array
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '_') {
                // If the character is not an underscore, add it to the result
                result[resultIndex++] = chars[i];
                inUnderscore = false;  // Reset the underscore flag
            } else {
                // If the character is an underscore and it's not consecutive
                if (!inUnderscore && resultIndex > 0) {
                    result[resultIndex++] = '_';  // Add a single underscore
                    inUnderscore = true;  // Mark that an underscore has been added
                }
            }
        }
        // Convert the result array to a string and print it
        String finalResult = new String(result, 0, resultIndex);

        // Print the result
        System.out.println(finalResult);
    }
}

