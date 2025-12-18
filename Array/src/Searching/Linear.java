package Searching;



public class Linear {
	public static void main(String[] args) {
		int a[]= {3,2,1,4,5};
		System.out.println(find(a, 1));
		
	}
	public static int find(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
	
}
