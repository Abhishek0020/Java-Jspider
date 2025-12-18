package Arr;

public class SubArray_Sum_Using_Brute {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int target=6;
		int maxsum=Integer.MIN_VALUE;
		
		
		for(int st=0;st<n;st++) {
			int currsum=0;
			for(int end=st;end<n;end++) {
				currsum +=arr[end];
				if(currsum<=target) {
				maxsum=Math.max(currsum, maxsum);
				}
			}
			
		}
		System.out.println("maximum subArray sum <= : "+target+" :  "+maxsum);
	
	}

}
