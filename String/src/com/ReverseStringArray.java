package com;	
public class ReverseStringArray {
    public static void main(String[] args) {
        // Create a string array of size 5
        String[] arr = new String[5];

        // Add 5 elements to the array
        arr[0] = "Apple";
        arr[1] = "Banana";
        arr[2] = "Cherry";
        arr[3] = "Date";
        arr[4] = "Elderberry";

        // Print the elements in reverse order
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
