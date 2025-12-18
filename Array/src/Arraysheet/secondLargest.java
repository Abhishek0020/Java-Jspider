package Arraysheet;

public class secondLargest {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		if(arr.length<2) {
			System.out.println("array is two small ...");
		}
		System.out.println(arr[arr.length-2]);
	}

}
