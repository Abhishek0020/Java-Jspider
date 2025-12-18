package Interview_Questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordCaseChecker {
    public static void main(String[] args) {
        String input = "hello World JAVA stream api";

        // Split sentence into words
        String[] words = input.split(" ");

        // Process using Stream API
        long count[] = {0}; // to track how many words were converted

        String result = Arrays.stream(words)
                .map(word -> {
                    if (!Character.isUpperCase(word.charAt(0))) {
                        count[0]++;
                        return word.toLowerCase(); // convert to lowercase if first letter is not uppercase
                    } else {
                        return word; // keep it as is
                    }
                })
                .collect(Collectors.joining(" "));

        // Output.
        System.out.println("Modified Sentence: " + result);
        System.out.println("Words converted to lowercase: " + count[0]);
    }
}

