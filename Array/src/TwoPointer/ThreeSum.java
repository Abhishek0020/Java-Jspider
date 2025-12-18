package TwoPointer;

public class ThreeSum {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int target=10;
		boolean result=ThreeSum(arr, target);
		System.out.println("THREE sum exist  : "+result);
		
	}
	public static boolean ThreeSum(int arr[],int target) {
		for(int i=0;i<arr.length-2;i++) {
			int left=i+1;
			int right=arr.length-1;
			int sum=arr[i]+arr[left]+arr[right];
			if(sum==target) {
				return true;
			}
			else if(sum<target) {
				left++;
				
			}
			else {
				right--;
			}
		}
		return false;
	}
}
