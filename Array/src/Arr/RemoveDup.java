package Arr;

public class RemoveDup {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,6,7,7,8,1};
//		int a[]= {1,3,4,3,1,5,6};
		int max=Integer.MAX_VALUE+1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==max)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=max;
				}
			}
			System.out.println(a[i]+" ");
		}
	}
}
