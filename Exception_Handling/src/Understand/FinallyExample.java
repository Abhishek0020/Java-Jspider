package Understand;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[5]=100;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index is out of bounds!");
		}
		finally {
			System.out.println("This block always executes.");
		}
		
		
	}

}
