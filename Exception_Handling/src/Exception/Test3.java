package Exception;

public class Test3 {
	public static void main(String[] args) {
		String string="abhishek";
		int n=0;
		try {
			n=Integer.parseInt(string);
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithmatic block : ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexblock");
			System.out.println(e.getMessage());
			System.out.println("exception block handled : ");
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("number format block : ");
		}
		System.out.println(n);
	}

}
