package Arr;

public class Bubble {
	public static void main(String[] args) {
		//binary search works on sorted array----------->
		int a[]= {2,4,6,8,10,12};
		Search(a, 2);	
	}
//	public static int search(int a[],int key) {
//		int st=0;
//		int end=a.length-1;
//		while(st<=end) {
//			int mid=(st+end)/2;
//			if(key==a[mid])
//				return mid;
//			else if(key<a[mid])
//				end=mid-1;
//			else if(key>a[mid])
//				st=mid+1;			
//		}
//		return -1;	
//	}
	
	public static void Search(int a[],int key) {
		int st=0;
		int end=a.length-1;
		
		
		while(st<=end) {
		 int mid=(st+end)/2;
		 if(a[mid]==key) { 
		 System.out.println("element "+key+" found "+mid+" index");
		
		 return;	
		 }
			else if(a[mid]>key) {
				end=mid-1;
			}
			else {
				st=mid+1;
			}
		}
	}
}
