package TwoPointer;

public class Reverse {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		reversed(arr);
	}
	public static void reversed(int arr[]) {
		int left=0,right=arr.length-1;
		
		while(left<right) {
			
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
			
		}
		System.out.println("reverse array elements : ");
		
		for(int val:arr) {
			System.out.println(val);
		}
	}

}
