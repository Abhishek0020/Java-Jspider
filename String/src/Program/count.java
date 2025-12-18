package Program;

public class count {
	public static void main(String[] args) {
		String string="JavaDev@123";
		int lc,uc=0,nc=0,sc=0;
		
		int count=0;
		
		for(int i=0;i<string.length()-1;i++) {
			char ch=string.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
