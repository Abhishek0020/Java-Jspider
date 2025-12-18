package Arr;

public class MaxsubArrayCircularSum {
	public static void main(String[] args) {
		int arr[]= {1,2,3,-4,-5,6,7};
		MaxsubArrayCircularSum obj=new MaxsubArrayCircularSum();
		int ans=obj.maxSubarraySumCircular(arr);
		System.out.println(ans);
		
		
	}
	public int circularSubarraySum(int[] arr, int num) {
        int res = arr[0];

        for (int i = 0; i < num; i++) {
            int currSum = arr[i];
            int currMax = arr[i];

            // Traverse sub Arrays starting at i
            for (int j = 1; j < num; j++) {
                int index = (i + j) % num;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }

            res = Math.max(res, currMax);
        }

        return res;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        return circularSubarraySum(nums, n);
    }

}
