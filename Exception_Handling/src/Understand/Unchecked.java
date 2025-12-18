package Understand;

public class Unchecked {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
	        System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("handled ArrayIndexOutofboundException");
			// TODO: handle exception
		}
          // Runtime error
    }

}
