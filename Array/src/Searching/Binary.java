package Searching;

public class Binary {
	public static void main(String[] args) {
		
		//binary search is also working on sorted array ------
		int a[]= {10,20,30,40,50,60};
		System.out.println(search(a, 60));
		
	}
	public static int search(int a[],int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(key==a[mid])
				return mid;
			else if(key<a[mid])
				end=mid-1;
			else if(key>a[mid])
				st=mid+1;
			
			
		}
		return -1;
		
	}

}
