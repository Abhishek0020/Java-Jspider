package Block_Implimention;

public class A {
	
	static {
		System.out.println(1);
	}
	
	static {
		System.out.println(2);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(5);
		
		{
			System.out.println(3);
		}


		{
			System.out.println(4);
		}
	}
	
	
}
