package TwoPointer;

public class MergeSorted {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {4,5,6};
		int[] merged=mergeArray(arr1, arr2);
		
		for(int val:merged)
		{
			System.out.println(val);
		}
		
	}
	public static int[] mergeArray(int[] a,int[] b) {
		int i=0,j=0,k=0;
		int result[]=new int[a.length+b.length];
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				result[k++]=a[i++];
			}
			else {
				result[k++]=b[j++];
			}
		}
		while(i<a.length) result[k++]=a[i++];
		while(j<b.length) result[k++]=b[j++];
		
		
		return result;
		
	}

}
