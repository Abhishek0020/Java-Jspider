package toChar;

public class UniqueChar {
    public static void main(String[] args) {
        String inputString = "java";
        
        // Convert the string to a character array
        char[] chars = inputString.toCharArray();

        // Loop through the character array to check for unique characters
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            boolean isUnique = true;

            // Check if the current character is repeated later in the array
            for (int j = 0; j < chars.length; j++) {
                if (i != j && currentChar == chars[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, print the character
            if (isUnique) {
                System.out.print(currentChar);
            }
        }
    }
}
