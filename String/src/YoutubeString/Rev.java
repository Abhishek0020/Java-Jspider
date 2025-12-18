package YoutubeString;

public class Rev {
	public static void main(String[] args) {
		String string="abhi";
		String rev=" ";
		for(int i=string.length()-1;i>=0;i--) {
			char ch=string.charAt(i);
			rev=rev+ch;
			
		}
		if(string.equalsIgnoreCase(rev))
			System.out.println(" yes it is ");
		else
			System.out.println("its not : ");
	}

}
