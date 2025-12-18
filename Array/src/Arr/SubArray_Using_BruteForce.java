package Arr;

public class SubArray_Using_BruteForce {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=5;
		
		int maxsum=Integer.MIN_VALUE;
		for(int st=0;st<n;st++) {
			int currsum=0;
			for(int end=st;end<n;end++) {
				currsum +=arr[end];
				maxsum=Math.max(currsum, maxsum);
			}
		}
		System.out.println("maximum subarray sum is : "+maxsum);
	}

}
