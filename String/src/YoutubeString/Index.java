package YoutubeString;

public class Index {
    public static void main(String[] args) {
        String string = "java";
        
        for(int i=0;i<string.length();i++) {
        	char c=string.charAt(i);
        	System.out.println("charecter at index "+i+":"+c);
        }
    }
}
