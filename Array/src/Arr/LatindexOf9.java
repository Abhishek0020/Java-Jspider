package Arr;

public class LatindexOf9 {
	public static void main(String[] args) {
		int a[]= {1,2,9,3,9,4,9,6,7,8};
		int lastindex=-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) {
			lastindex=i;
			}
		}
		if(lastindex !=-1) {
			System.out.println("last index of 9 is: "+lastindex);
		}
		else {
			System.out.println("9 is not found in the array : ");
		}
		
	}

}
