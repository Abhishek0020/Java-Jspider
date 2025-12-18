package Understand;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int a=1/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: Cannot divide by zero.");
		}
		
		
	}

}
