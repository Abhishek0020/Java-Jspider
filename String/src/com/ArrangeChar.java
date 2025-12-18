package com;

public class ArrangeChar {
	public static void main(String[] args) {
		String s="JavaDev123@#*";
		String uc=" ",lc=" ",nc=" ",sc=" ";
		String res=" ";
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='z')
				uc=uc+ch;
			else if(ch>='a' && ch<='z')
				lc=lc+ch;
			else if(ch>='0' && ch<='9')
				nc=nc+ch;
			else 
				sc=sc+ch;
			
		}
		res=uc+lc+nc+sc;
		System.out.println(res);
		System.out.println("upper : "+uc);
		System.out.print("lower : "+lc);
		System.out.print("nc : "+nc);
		System.out.println("sc : "+sc);
		
	}

}
