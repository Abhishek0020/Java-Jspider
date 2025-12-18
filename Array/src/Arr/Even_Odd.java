package Arr;

public class Even_Odd {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
//			if(i%2==0) {
//				System.out.println("even index is : "+i);
//			}
//			else {
//				System.out.println("odd index is "+i);
//			}
			
			if(arr[i]%2==0)
				System.out.println(i+" : even value");
			else 
				System.out.println(i+" :odd value");
		}
	}

}
