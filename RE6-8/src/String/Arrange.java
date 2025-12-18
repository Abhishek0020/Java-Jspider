package String;

public class Arrange {
	public static void main(String[] args) {
		String s="ram#123";
		String res="";
		String lc=" ",nc=" ",sc=" ";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				nc+=ch;
			}
			else if(ch>='a' && ch<='z') {
				lc+=ch;	
			}
			else {
				sc+=ch;	
			}
		}
		res=nc+sc+lc;
		System.out.println(res);
	}
}
