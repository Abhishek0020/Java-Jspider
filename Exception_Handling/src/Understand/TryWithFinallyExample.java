package Understand;

public class TryWithFinallyExample {
	public static void main(String[] args) {
		try {
			int result=1/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("caught exception : "+e.getMessage());
			
			
		}
		finally {
			System.out.println("finally block always runs...");
			
		}
		
		
	}

}
