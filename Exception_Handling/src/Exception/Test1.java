package Exception;


public class Test1 {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("handled : ");
			s=" ";
		}
		System.out.println(s.length());
	}

}
