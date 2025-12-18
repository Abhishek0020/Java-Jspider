package toChar;
public class ReplaceConsecutive {
    public static void main(String[] args) {
        String inputString = "Boss";
        
        // Convert the string to a character array
        char[] chars = inputString.toCharArray(); 

        // Loop through the character array to check for consecutive characters
        for (int i = 0; i < chars.length; i++) {
            // Check if the current character is the same as the next one
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                System.out.print(chars[i]);  // Print the character
                System.out.print('$');       // Print '$' after the character
                i++;  // Skip the next character as it's already handled
            } else {
                System.out.print(chars[i]);  // Print the current character
            }
        }
    }
}
