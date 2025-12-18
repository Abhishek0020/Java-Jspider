package com;

public class StringPermutation{
    public static void main(String[] args) {
        String input = "abc";  // Input string
        char[] chars = input.toCharArray();  // Convert input string to char array
        int n = chars.length;

        
        
        // Generate all permutations using a loop
        permute(chars, n);
    }

    // Function to generate all permutations of the string using loops
    public static void permute(char[] arr, int n) {
        // Generate all permutations using a loop-based approach
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        

        // Print the first permutation
        printPermutation(arr);

        
        while (true) {
        	
            // Find the largest i such that arr[i] < arr[i + 1]
        	
            int i = n - 2;
            while (i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }

            if (i < 0) {
                break;  // If no such i exists, we are done
            }

            // Find the largest j greater than i such that arr[i] < arr[j]
            int j = n - 1;
            while (arr[i] >= arr[j]) {
                j--;
            }

            // Swap arr[i] and arr[j]
            swap(arr, i, j);

            // Reverse the subarray from i + 1 to the end of the array
            reverse(arr, i + 1, n - 1);

            // Print the new permutation
            printPermutation(arr);
        }
    }

    
    // Helper method to swap elements at two indices
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    // Helper method to reverse a subarray
    
    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    
    // Helper method to print a permutation
    public static void printPermutation(char[] arr) {
        System.out.println(new String(arr));
    }
}


