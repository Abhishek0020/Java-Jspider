package Arr;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {5,4,7,8,3,2,1,0};
		sort(a);
		System.out.println(Arrays.toString(a));
	
	}
	
public static void sort(int a[]) {
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
