package toChar;

public class InitCap {
	public static void main(String[] args) {
		String s="java is easy";
		System.out.println(InitCap("java is easy"));
		
	}
	
	public static String InitCap(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0||ch[i-1]==' ')
				ch[i]-=32;
		}
	return new String(ch);	
}
}
