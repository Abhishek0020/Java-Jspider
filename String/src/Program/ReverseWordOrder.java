package Program;

public class ReverseWordOrder {
    public static String reverseWordOrder(String sentence) {
        String[] words = sentence.trim().split("\\s+"); // Split by one or more spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim(); // Remove extra space at the end
    }

    public static void main(String[] args) {
        String sentence = "java is easy";
        String reversed = reverseWordOrder(sentence);
        System.out.println("Output: " + reversed);
    }
}

