package Arr;

public class UnqueElement {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,1,5,6,6,7};
		unique(a);
		
	}
	public static void unique(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					a[i]=0;
				}
			}
			if(a[i]==0) continue;
			System.out.println(a[i]+" ");
		}
	}
	

}
