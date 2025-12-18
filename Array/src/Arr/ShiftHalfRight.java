package Arr;

import java.util.*;

public class ShiftHalfRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int half = n / 2;

        int[] result = new int[n];

        // Copy second half to beginning
        for (int i = 0; i < n - half; i++) {
            result[i] = arr[half + i];
        }

        // Copy first half to end
        for (int i = 0; i < half; i++) {
            result[n - half + i] = arr[i];
        }

        // Print shifted array
        System.out.print("Array after shifting half to right: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

