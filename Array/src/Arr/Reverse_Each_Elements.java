package Arr;

public class Reverse_Each_Elements {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		for(int val:arr) {
			int rev=0;
			int temp=val;
			while(temp>0) {
				rev=rev*10+temp%10;
				temp /=10;
				
			}
			System.out.println(rev);
		}
	}

}
