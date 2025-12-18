package Arr;

public class MissingElement {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5, 6};
	        int n = arr.length + 1;  // Because one number is missing

	        // Expected sum of 1 to n
	        int totalSum = n * (n + 1) / 2;

	        // Actual sum of array
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }

	        int missing = totalSum - actualSum;

	        System.out.println("Missing number is: " + missing);
	    }
}
