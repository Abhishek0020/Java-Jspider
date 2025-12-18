package Leetcode;

public class PairSum {

	//pair sum with help of brute force approach--
	public static void main(String[] args) {
		int arr[]= {3,7,6,4,1,9};
		int target=10;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					count++;
				}
			}
		}
		System.out.println("pair sum count  is :  "+count);
	}
}
