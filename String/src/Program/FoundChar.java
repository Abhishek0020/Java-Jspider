package Program;

public class FoundChar {
    public static void main(String[] args) {
        String string = "ash@123";
        char key = 's';
        int index = -1;
        
        // Loop through the string to find the character
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == key) {
                index = i;  // Set the index when the character is found
                break;  // Exit the loop once the character is found
            }
        }
        
        // Output the result
        if (index != -1)
            System.out.println("The character " + key + "' is found at index " + index);
        else
            System.out.println("The character " + key + "' is not found.");
    }
}
