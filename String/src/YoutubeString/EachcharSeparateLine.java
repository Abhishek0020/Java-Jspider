package YoutubeString;

public class EachcharSeparateLine {
	public static void main(String[] args) {
		String string="Its simple";
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
			System.out.println(c);
		}
	}

}
