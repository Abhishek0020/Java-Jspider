package Arr;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Fisher–Yates shuffle algorithm
        for (int i = arr.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i
            int j = (int)(Math.random() * (i + 1));

            // Swap arr[i] with arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }
}
