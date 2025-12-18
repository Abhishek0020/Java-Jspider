package Arr;

public class Insert {
	public static void main(String[] args) {
		int org[]= {1,2,3,4};
		int insertEelement=5;
		int insertIndex=3;
		
		// Create new array of size + 1
		int newArr[]=new int[org.length+1];
		
		// Copy elements before insertIndex
		for(int i=0;i<insertIndex;i++) {
			newArr[i]=org[i];	
		}
		// Insert new element
		newArr[insertIndex]=insertEelement;
		 // Copy the rest of the elements
		for(int i=insertIndex;i<org.length;i++) {
			newArr[i+1]=org[i];
		}
		// Print the new array
		System.out.println("new array after insertion");
		for(int num:newArr) {
			System.out.println(num+" ");
		}
	}
}
