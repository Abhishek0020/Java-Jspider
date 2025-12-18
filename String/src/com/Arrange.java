package com;

public class Arrange {
	public static void main(String[] args) {
		String s="JavaDev@123#";
		String lc=" ",uc=" ",nc=" ",sc=" ";
		String res=" ";
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch >='A' && ch<='Z')
				uc=uc+ch;
			else if(ch >='a' && ch <='z')
				lc=lc+ch;
			else if(ch>='0' && ch<='9')
				nc=nc+ch;
			else sc=sc+ch;
		}
		res=lc+uc+nc+sc;
		System.out.println(res);
		
	}

}
