package Program;

public class OccurrenceChar {
    public static void main(String[] args) {
        String s1 = "javadev";  // Input string

        while (s1.length() != 0) {
            char ch = s1.charAt(0);  // Get the first character of the string
            // Replace the character 'ch' with an empty string to remove its occurrences
            String s2 = s1.replace(String.valueOf(ch), "");
            
            // Calculate how many times 'ch' appeared in the string
            int count = s1.length() - s2.length();
            
            // Print the character and its count
            System.out.println(ch + "=" + count);
            
            // Update the string by removing all occurrences of 'ch'
            s1 = s2;
        }
    }
}
