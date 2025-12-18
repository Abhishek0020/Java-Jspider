package Exception;

public class Test {
	public static void main(String[] args) {
		System.out.println("main start : ");
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("handled : ");
			
		}
		System.out.println("main end : ");
	}

}
