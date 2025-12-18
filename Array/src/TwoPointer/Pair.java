package TwoPointer;

public class Pair {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int target=10;
		 boolean result=pair(arr,target);
		 System.out.println("pair exist : "+result);
	
	}
	public static boolean pair(int arr[],int target) {
//		Arrays.sort(arr);
		int left=0,right=arr.length-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				return true;
				
			}else if(sum<target)
			{
				left++;
			}
			else {
				right--;
			}
		}
		return false;
		
	}

}
