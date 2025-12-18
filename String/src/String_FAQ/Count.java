package String_FAQ;

public class Count {
	public static void main(String[] args) {
		String string="Abhishek@20150013";
		
		int uc=0,lc=0,nc=0,sc=0;
		
		int count=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch>='A' && ch<='Z') {
				uc++;
				
			}
			else if(ch>='a' && ch<='z') {
				lc++;
				
			}
			else if(ch>=0 && ch>=9) {
				nc++;
			}
			else {
				sc++;
				
			}
		}
		System.out.println("upper count is : "+uc);
		System.out.println("lower count is : "+lc);
		System.out.println("nc : "+nc);
		System.out.println("sc : "+sc);
	}

}
