package Sorting;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		int a[]= {9,5,3,10,2,1};
		insertion(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void insertion(int a[]) {
		for(int i=0;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
