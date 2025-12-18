package Arr;

public class MaxSumsubArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, -2, 5};
	        int n = arr.length;

	        int maxSum = arr[0];
	        int currSum = arr[0];

	        for (int i = 1; i < n; i++) {
	            currSum = Math.max(arr[i], currSum + arr[i]);  // Either start new or extend
	            maxSum = Math.max(maxSum, currSum);            // Track maximum sum
	        }

	        System.out.println("Maximum Subarray Sum = " + maxSum);
	    }
	}


