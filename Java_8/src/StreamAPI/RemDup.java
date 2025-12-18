package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemDup {
    static String res = "";  

    public static void main(String[] args) {
        String s = "bangalore is bangalore city";
        String[] str = s.split(" ");
        List<String> l = Arrays.asList(str);

        l.stream()
         .distinct()
         .forEach(i -> res += i + " ");

        System.out.println(res.trim()); 
    }
}
