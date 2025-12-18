
package com;

public class Even_odd_Index {
	public static void main(String[] args) {
		String s="Abhishek Pal";
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			
			if(s.charAt(i)%2==0) {
				System.out.println("even index is"+ch);	
			}
			else {
				System.out.println("odd index is :"+ch);
			}
		}
	}
}
