package Arr;

import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int[][] a= {{1,4,2},{9,1,0},{2,3,4}};
		int [][]b= {{1,1,2},{1,6,2},{1,9,3}};
	    
		int[][] c=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) 
				
				c[i][j]=a[i][j]+b[i][j];
			
			}
		for(int n[]:c)
		{
			System.out.println(Arrays.toString(n));
		}
		
		
	}

}
