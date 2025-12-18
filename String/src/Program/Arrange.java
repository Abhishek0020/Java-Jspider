package Program;

public class Arrange {
	public static void main(String[] args) {
		String string="ram#123";
		String lc=" ",nc=" ",sc=" ";
		String res=" ";
		for(int i=0;i<string.length()-1;i++)
		{
			char ch=string.charAt(i);
			if(ch>='a' && ch<='z') lc+=ch;
			else if(ch>='0' && ch<='9') nc+=ch;
			else sc+=ch;
			
				
			
		}
		res=lc+sc+nc;
		System.out.println(res);
	}

}
