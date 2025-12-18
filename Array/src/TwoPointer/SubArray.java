package TwoPointer;

public class SubArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		subArrayOfLengthk(arr, 3);
		
		
	}
	public static void subArrayOfLengthk(int arr[],int k) {
		
		
	   int left=0,right=0;
	   while(right<arr.length) {
		   if(right-left+1==k) {
			   for(int i=left;i<=right;i++) {
				   System.out.print(arr[i]+" ");
			   }
			   
			   System.out.println();
			   left++;
			   
		   }
		   right++;
		   
	   }
	}

}
