package com;

public class CharCount {
	public static void main(String[] args) {
		String s="JavaDev@12#@*";
		
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
