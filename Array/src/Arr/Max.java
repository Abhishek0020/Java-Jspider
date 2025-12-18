package Arr;

public class Max {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,9,10};
		int max=0;
		for(int n:arr) {
			if(n>max)
				max=n;
		}
		System.out.println("largest elements is : "+max);
	}
}
