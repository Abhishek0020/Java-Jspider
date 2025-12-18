package YoutubeString;

public class Ascii {
	public static void main(String[] args) {
		String string="Its Simple";
		for(int i=0;i<string.length();i++) {
			 char c=string.charAt(i);
			 System.out.println(c+" Ascii values is  "+(int)c);
		}
	}

}
