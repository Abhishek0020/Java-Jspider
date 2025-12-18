package StreamAPI;

public class RemoveDupChar {
	static String res="";
	public static void main(String[] args) {
		String s="javdev";
		s.chars().distinct().forEach(i->res+=(char)i);
		System.out.println(res);
		
	}

}
