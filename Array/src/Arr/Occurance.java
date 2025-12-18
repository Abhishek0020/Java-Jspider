package Arr; // only include this line if your file is inside a folder named 'Arr'

import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 2, 6, 4, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " | Count: " + entry.getValue());
        }
    }
}
