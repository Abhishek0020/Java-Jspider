package YoutubeString;

public class StringToWordArray {

	public static void main(String[] args) {
		String string="java is awesome";
		
		String[] wordsArray=string.split(" ");
		
		for(String word:wordsArray) {
				System.out.println(word);
		}
	}
}
