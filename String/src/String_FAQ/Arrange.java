package String_FAQ;



public class Arrange {
	public static void main(String[] args) {
		String string="AbhishekPal12323&*@";
	    String lc=" ",uc=" ",nc=" ",sc=" ";
	   for(int i=0;i<string.length();i++) {
		   char ch=string.charAt(i);
		   if(ch>='a' && ch<='z') lc+=ch;
		   else if(ch>='A' && ch<='Z') uc+=ch;
		   else if(ch>= '0' && ch<='9') nc+=ch;
		   else sc+=ch;
		  
	   }
	   System.out.println("lc : "+lc);
	   System.out.println("uc: "+uc);
	   System.out.println("nc :"+nc);
	   System.out.println("sc : "+sc);
	    
	}

}
