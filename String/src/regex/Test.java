package regex;

public class Test {
	public static void main(String[] args) {
		String string="Ra1ma2na3";
//		string=string.replaceAll("[a-z]", "");
		string=string.replaceAll("[0-9]","");
		
		System.out.println(string);
	}

}
