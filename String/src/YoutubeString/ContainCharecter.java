package YoutubeString;

public class ContainCharecter {
    public static void main(String[] args) {
        String string = "Abhishek Pal";  // Input string
        String sn = "";  // Empty string to store uppercase characters
        
//        for(int i=0;i<string.length();i++) {
//        	char ch=string.charAt(i);
//        	if(Character.isUpperCase(ch))
//        	{
//        		sn=sn+ch;
//        		
//        	}
//        }
//        System.out.println(sn);
        
        
        
        for(int i=0;i<string.length();i++) {
        	char ch=string.charAt(i);
        	if(Character.isLowerCase(ch))
        		sn=sn+ch;
        	
        	
        }
        System.out.println(sn);
    }
}
