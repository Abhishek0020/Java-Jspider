package Arr;
public class maxSubArraySum
{
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        //using bruteForceApproach
        int maxSum = Integer.MIN_VALUE;  // Start with the smallest possible value

        for (int st = 0; st < n; st++) {
            int currSum = 0;
            for (int end = st; end < n; end++) 
            {
                currSum += arr[end];  // Add current element to subarray sum
                maxSum = Math.max(currSum, maxSum);  // Update maxSum if needed
            }
        }

        System.out.println("Max subarray sum = " + maxSum);
    }
}
