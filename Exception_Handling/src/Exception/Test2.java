package Exception;

public class Test2 {
	public static void main(String[] args) {
//		System.out.println("main start : ");
		int a[]= {4,3,5,1};
		try {
			System.out.println(a[3]/0);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
