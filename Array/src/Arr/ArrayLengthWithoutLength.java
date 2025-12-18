package Arr;

public class ArrayLengthWithoutLength {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int count=0;
		
		try {
			while(true) {
				int val=a[count];
				count++;
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the length of an Array is : "+count);
		}
	}

}
