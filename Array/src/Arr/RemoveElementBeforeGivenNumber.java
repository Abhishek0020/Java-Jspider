package Arr;

import java.util.*;

public class RemoveElementBeforeGivenNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int givenNumber = 30;

        // Convert array to list for easier removal
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        int index = list.indexOf(givenNumber);

        if (index > 0) {
            // Remove element before the given number
            list.remove(index - 1);
        } else {
            System.out.println("Given number is at the first position or not found, no element removed.");
        }

        System.out.println("Array after removal: " + list);
    }
}

