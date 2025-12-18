package com;

public class SecondMax {
	public static void main(String[] args) {
		String s1="jjjjjjavvvvvaadev";
		int max=0;
		char maxChar=' ';
		int max2=0;
		char maxChar2=' ';
		while(s1.length() !=0)
		{
			char ch=s1.charAt(0);
			String s2=s1.replace(ch+" "," ");
			int count=s1.length()-s2.length();
			if(count>max) {
				max2=max;
				maxChar=ch;
			}
			else if (count>max2 && count !=max) {
				maxChar=ch;
				max2=count;	
			}
			s1=s2;
		}
		System.out.println(maxChar+"="+max);
		System.out.println(maxChar2+" ="+max2);
	}

}
