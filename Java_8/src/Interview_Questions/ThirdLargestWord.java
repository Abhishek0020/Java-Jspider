package Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestWord {
	public static void main(String[] args) {
        String input = "Java Stream API makes coding elegant and efficient";

        // Split the string into words and sort them by length in descending order
         List<String> sortedWords = Arrays.stream(input.split(" "))
                .distinct() // remove duplicates if needed
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());

        if (sortedWords.size() < 3) {
            System.out.println("Less than 3 unique words available.");
        } else {
            String thirdLargest = sortedWords.get(2);
            System.out.println("Third largest word: " + thirdLargest);
            System.out.println("Length: " + thirdLargest.length());
        }
    }

}
