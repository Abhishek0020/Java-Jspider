package Arr;

public class SecondMin {

	public static void main(String[] args) {
//		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		//IF array is sorted --->
//		int min_1 = Integer.MAX_VALUE;
//		int min_2 = Integer.MAX_VALUE;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] < min_1) {
//				min_2 = min_1;
//				min_1 = a[i];
//			} else if (a[i] < min_2 && a[i] != min_1) {
//				min_2 = a[i];
//			}
//		}
		

//		System.out.println(min_1);
//		System.out.println(min_2);
		
		int a[]= {4,1,2,3,5};
		int min_1=a[0];
		int min_2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min_1) { 
				min_2=min_1;
				min_1=a[i];
			}
			else if(a[i]<min_2 && a[i]!=min_1) {
				min_2=a[i];
		}		
    }
		System.out.println(min_2);
  }
}
