package Interview_Questions;

public class HalfReverseReplace {
    public static void main(String[] args) {
        String input = "Abhishek";
        char replacementChar = '*';
        

        String result = reverseAndReplace(input, replacementChar);
        System.out.println("Result: " + result);
    }

    public static String reverseAndReplace(String str, char ch) {
        int len = str.length();
        int mid = len / 2;

        // Reverse first half
        String firstHalf = new StringBuilder(str.substring(0, mid)).reverse().toString();

        // Replace second half with the given character
        String secondHalf = String.valueOf(ch).repeat(len - mid);

        return firstHalf + secondHalf;
    }
}

