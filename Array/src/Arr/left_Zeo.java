package Arr;

import java.util.Arrays;

public class left_Zeo {
	public static void main(String[] args) {
		int a[]= {1,0,3,0,5,6,0,7,0,9};
		int b[]=new int[a.length];
		int j=b.length-1;
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				b[j]=a[i];
				j--;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
