package Arr;

public class convertArrayElements {
	public static void main(String[] args) {
		int a[]= {-1,2,0,-1,4,0};
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[i]=-1;
			}
			else if (a[i]==-1) {
				a[i]=0;
			}
		}
		for(int n:a) {
			System.out.println(n);
		}
	}

}
