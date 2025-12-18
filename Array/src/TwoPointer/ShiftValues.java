package TwoPointer;

public class ShiftValues {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		
		shiftValue(arr);
		for(int val:arr) {
			System.out.println(val);
		}
		
	}
	public static void shiftValue(int arr[]) {
		int left=0;
		
		for(int right=0;right<arr.length;right++) {
			if(arr[right]!=0) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
			}
		}
	}

}
