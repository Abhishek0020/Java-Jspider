package Arr;

public class Min {
	public static void main(String[] args) {
		int arr[]= {6,1,2,3,4,5,6,7};
		int min=arr[0];
		for(int n:arr) {
			if(n<min)
				min=n;
		}
		System.out.println(min);	
	}
	


}
