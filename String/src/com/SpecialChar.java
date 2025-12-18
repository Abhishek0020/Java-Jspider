package com;

public class SpecialChar {
	
	public static void main(String[] args) {
		String s="abc1123!@#$";
		
		System.out.println("the special charecter is :-----");
		for(int i=0;i<=s.length()-1;i++) {
			
			char ch=s.charAt(i);
			if(!((ch>='a' && ch<='z') || (ch>='0' && ch<='9')) )
			{
				System.out.print(ch);
			}
		}
	}

}
