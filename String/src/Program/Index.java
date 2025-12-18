package Program;

public class Index {

	public static void main(String[] args) {
		String string="banana";
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			System.out.println(ch+" = "+string.indexOf(ch,i));
		}
	}
}
