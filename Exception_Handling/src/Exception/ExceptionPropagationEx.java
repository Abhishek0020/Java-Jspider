package Exception;


public class ExceptionPropagationEx {
	public static void main(String[] args) {
		System.out.println("main start : ");
		
		try {
			m1();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("handled : ");
		}
		
	}
	public static void m1() {
		System.out.println("m1 start : ");
		m2();
		System.out.println("m1 end");
	}
	public static void m2() {
		System.out.println("m2 start : ");
		System.out.println(10/0);
		System.out.println("m2 ends ");
		
	}

}
