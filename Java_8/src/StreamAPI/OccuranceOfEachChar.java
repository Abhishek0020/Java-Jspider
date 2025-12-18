package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachChar {
    public static void main(String[] args) {
        String s = "javadev";

        Map<Object, Long> m = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(
                        c -> c,
                        () -> new LinkedHashMap<>(),
                        Collectors.counting()
                ));
       m.forEach((ch, i) -> System.out.println(ch + "=" + i));
    }
}
