package Program;

public class Swap {
    public static void main(String[] args) {
        String input = "abcde";

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Swap 'b' (index 1) and 'd' (index 3)
        char temp = charArray[1];
        charArray[1] = charArray[3];
        charArray[3] = temp;

        // Convert the modified character array back to a string
        String output = new String(charArray);
        System.out.println(output); // Output: adcbe
    }
}
