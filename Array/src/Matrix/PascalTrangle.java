package Matrix;

public class PascalTrangle {
	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int st=1;
		int a[][]=new int [n][];
		pascal(a);
		for(int i=0;i<n;i++) {
			for(int j=1;j<sp;j++)
				System.out.print(" ");
			for(int k=0;k<st;k++)
				System.out.print(a[i][k]+" ");
			System.out.println();
			sp--;
			st++;
		}
	}
	public static void pascal(int a[][]) {
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0|| i==j)
					a[i][j]=1;
				else 
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				
			}
		}
	}

}
