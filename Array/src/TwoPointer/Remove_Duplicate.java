package TwoPointer;

public class Remove_Duplicate {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,4,4};
		int count=removeduplucates(arr);
		
		
		System.out.println("unique elements : "+count);
		
	}
	public static  int removeduplucates(int arr[]) {
		
		if(arr.length==0)return 0;
		
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i] !=arr[j]) {
				i++;// move pointer
				arr[i]=arr[j];// shift unique value forward
				
			}
		}
		System.out.println("unique elements : ");
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	
		return i+1;
			
	}

}
