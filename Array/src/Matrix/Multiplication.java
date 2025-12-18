package Matrix;

import java.util.Arrays;

public class Multiplication {
	public static void main(String[] args) {
		int a[][]= {{1,2,1},
				{1,3,4},
				{1,6,5}
		};
		int b[][]= {{2,1,2},
				{3,2,5},
				{4,4,3}};
		int [][]c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
					
				}
			}
		}
		for(int n[]:c) {
			System.out.println(Arrays.toString(n));
		}
		
	}
	

}
