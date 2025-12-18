package Program;

public class WordCount {
	public static void main(String[] args) {
		
		String string="Abhishek is my name ";
		string=string.trim();
		
		int wordcount=0;
		if(string.length()>0) {
			wordcount=1;
		}
		for(int i=1;i<string.length();i++) {
			if(string.charAt(i)==' ' && string.charAt(i-1)!=' ')
			{
				wordcount++;
				
			}
			
		}
		System.out.println(wordcount);
	}

}
