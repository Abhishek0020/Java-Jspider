package Arr;

import java.util.Arrays;

public class Zero_left_Shift {

	public static void main(String[] args) {
		int a[]= {3,0,1,2,3,0,5,0,7};
		int b[]=new int[a.length];
		int j=b.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i] !=0) {
				b[j]=a[i];
				j--;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
