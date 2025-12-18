package Leetcode;

public class TwoSum {
	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		int result[]=TwoSum.twosum(nums, target);
//		System.out.println(result[0]+","+result[1]);
		
	}
	public static int[] twosum(int nums[],int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};//return the indexes of the two numbers...
				}
			}
		}
		return new int[] {};//if no solution is found return an empty array...		
	}
}
