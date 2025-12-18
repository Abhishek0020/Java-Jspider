package Arr;
public class Searching {
	public static void main(String[] args) {
//		int a[]= {9,2,1,3,8,7};
//		System.out.println(find(a, 7));
//		
//	}
//	public static int find(int[] a,int key) {
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==key) {
//				return i;
//			}
//			
//		}
//		return -1;
		
//		int a[]= {1,2,3,4,5};
//		int key=5;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==key) {
//				System.out.println("element present at : " +i+ " index position");
//			}
		
		//find the index of given elements---
		int a[]= {1,2,3,4,5};
		find(a, 1);	
	}
	public static void find(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println(i);
			}
		}
		
	}
}
