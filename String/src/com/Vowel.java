package com;

public class Vowel {
	public static void main(String[] args) {
		String s="javadev";
//		String res=" ";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='u' || ch=='o') {
				
				count++;
				

//	        	System.out.println(ch);
				
				
			}
	

//			System.out.println(count);
//			System.out.println(s);
//			System.out.println(res);
			
		}
		System.out.println(count);
	
	}

}
