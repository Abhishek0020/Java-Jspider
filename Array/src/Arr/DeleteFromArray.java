package Arr;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int deleteIndex = 2;

        // New array of size - 1
        int[] newArray = new int[original.length - 1];

        int j = 0; // index for newArray

        for (int i = 0; i < original.length; i++) {
            if (i == deleteIndex) {
                continue; // Skip the element at index 2
            }
            newArray[j] = original[i];
            j++;
        }

        // Print the new array
        System.out.print("Array after deletion: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
