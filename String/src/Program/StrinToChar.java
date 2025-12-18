package Program;

public class StrinToChar {
	public static void main(String[] args) {
		String string="helloWorld";
		char[] charArray=new char[string.length()];
		for(int i=0;i<string.length();i++) {
			charArray[i]=string.charAt(i);
			
		}
		System.out.println("converted to string to charArray : ");
		for(char c:charArray) {
			System.out.print(c+" ");
			
		}
	}

}
