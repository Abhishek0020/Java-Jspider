package Program;

public class CountCase {
	public static void main(String[] args) {
	String string="AbhishekPal@123";
	int lc=0,uc=0,nc=0,sc=0;
	for(int i=0;i<string.length()-1;i++) {
		char ch=string.charAt(i);
		if(ch>='a' && ch<='z')lc++;
		else if(ch>='A' && ch<='Z')uc++;
		else if(ch>='0' && ch<'9')nc++;
		else sc++;
		
	}
	System.out.println("uppser case is : "+uc);
	System.out.println("lower case is : "+lc);
	System.out.println("number count is : "+nc);
	System.out.println("special charecter count is : "+sc);
	}

}
