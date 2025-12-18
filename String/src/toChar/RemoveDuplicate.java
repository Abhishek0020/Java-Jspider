package toChar;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String string="java";
		char[] ch=string.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000')
				continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]==ch[i])
				ch[j]='\u0000';
			}
			res+=ch[i];
		}
		System.out.println(res);	
	}
}
