package com;

public class Palindrome {
	public static void main(String[] args) {
//		String s="malayalam";
//		if(ispalindrome(s))
//			System.out.println(s+" is palindrome  : ");
//		else
//			System.out.println(s+"	is not a palindrome string : ");		
//	}	
//	public static boolean ispalindrome(String s) {
//		int i=0;
//		int j=s.length()-1;
//		while(i<j) {
//			if(s.charAt(i) !=s.charAt(j))
//				return false;
//			i++;
//			j--;	
//		}
//		return true;
		
		        String s = "nitin";
		        String orgString = s;
		        String res = "";
		        
		        for (int i = s.length() - 1; i >= 0; i--) {
		            res = res + s.charAt(i);
		        }

		        if (orgString.equals(res)) {
		            System.out.println(res + " is a palindrome");
		        } else {
		            System.out.println(res + " is not a palindrome");
		        }
	}
}
