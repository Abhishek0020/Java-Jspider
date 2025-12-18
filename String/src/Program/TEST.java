package Program;
//public class TEST {
//    public static String decodeString(String s) {
//        String result = "";
//        int i = 0;
//
//        while (i < s.length()) {
//            // Extract the number
//            int count = s.charAt(i) - '0'; // Convert char to integer
//            char ch = s.charAt(i + 1); // Get the character
//            
//            // Append the character 'count' times to result
//            for (int j = 0; j < count; j++) {
//                result += ch; // String concatenation
//            }
//            
//            i += 2; // Move to the next pair
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String input = "2a3b1c";
//        String output = decodeString(input);
//        System.out.println(output); // Output: aabbbc
//    }
//}
public class TEST {
    public static String encodeString(String s) {
        String result = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // Increment count if the current char is same as previous
            } else {
                result += count + "" + s.charAt(i - 1); // Append count and character
                count = 1; // Reset count
            }
        }
        // Append the last character and its count
        result += count + "" + s.charAt(s.length() - 1);

        return result;
    }

    public static void main(String[] args) {
        String input = "aabccadd";
        String output = encodeString(input);
        System.out.println(output); // Output: 2a1b2c1a2d
    }
}

