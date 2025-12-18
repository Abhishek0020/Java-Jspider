package YoutubeString;

public class UpperCase {
	public static void main(String[] args) {
		String string="Its Simple123";
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
//			if(Character.isUpperCase(c))
//				System.out.println(c);
//			if(Character.isLowerCase(c))
//				System.out.println(c);
//			if(Character.isDigit(c))
//				System.out.println(c);
			if(Character.isLetter(c))
				System.out.println(c);
		}
	}

}
