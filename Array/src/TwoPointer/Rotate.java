package TwoPointer;

public class Rotate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		rotateRight(arr, 2);
		
	}
	public static void rotateRight(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n; 

	    reverse(arr, 0, n - 1);
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);

	    System.out.print("Rotated Array: ");
	    for (int val : arr) System.out.print(val + " ");
	    System.out.println();
	}

	private static void reverse(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}


}
