package Exception;

public class Demo {
	public static void main(String[] args) {
		System.out.println("main start : ");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("handled : ");
		}
		System.out.println("main end : ");
	}

}
