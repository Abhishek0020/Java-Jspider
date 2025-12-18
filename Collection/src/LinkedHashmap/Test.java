package LinkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Honey");
        map.put(5, "Sweet");
        map.put(2, "place");
        map.put(6, "India");
        map.put(9, "Avyak");

        Set<Map.Entry<Integer, String>> set = map.entrySet();  // Change this line to use Map.Entry
        for (Map.Entry e : set) {
            System.out.println(e);
        }
    }
}
