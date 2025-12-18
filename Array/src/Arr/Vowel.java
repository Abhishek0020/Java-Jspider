package Arr;

public class Vowel {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println("Vowel characters in the array:");
        for (char ch : a) {
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    // Helper method to check for vowels
   public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Handle uppercase too
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
