package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerStreamList {
    public static void main(String[] args) {
        String s = "A,B,C,D";

        // Split the string into a list
        List<String> result = Arrays.stream(s.split(","))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase list: " + result);
    }
}

