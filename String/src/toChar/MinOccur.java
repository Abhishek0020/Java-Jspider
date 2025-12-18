package toChar;

public class MinOccur {
    public static void main(String[] args) {
       
    	String s = "jaaaaava";
        char[] ch = s.toCharArray();
        
        
        char minChar = '\u0000';  // Initialize to null character
        int minCount = ch.length;  // Set minCount to the maximum possible count (length of string)

        // Loop through the characters of the string
        for (int i = 0; i < ch.length; i++) {
            int count = 1;  // Start with a count of 1 because the character at ch[i] is already counted

            // Skip the character if it's already counted (marked as '\u0000')
            if (ch[i] == '\u0000') continue;

            // Count occurrences of the character
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';  // Mark the character as counted
                }
            }

            // Check if this character's count is less than the current minCount
            if (count < minCount) {
                minCount = count;
                minChar = ch[i];
            }
        }

        // Print the character with the minimum occurrence count
        System.out.println(minChar + " = " + minCount);
    }
}
