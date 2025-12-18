package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);

        // Square each number
        List<Integer> list = l.stream()
                              .map(i -> i * i)
                              .collect(Collectors.toList());

        System.out.println(list);  // Output: [81, 64, 49, 36, 25, 16, 9, 4, 1]
    }
}
