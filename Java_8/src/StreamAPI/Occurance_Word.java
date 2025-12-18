package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurance_Word {
    public static void main(String[] args) {
        String s = "Bangalore is Bangalore city";

        String[] str = s.split(" "); // Split by space to get words
        List<String> l = Arrays.asList(str);

        Map<Object, Long> m = l.stream()
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        m.forEach((ch, i) -> System.out.println(ch + " = " + i));
    }
}
