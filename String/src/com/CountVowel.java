package com;

public class CountVowel {
	public static void main(String[] args) {
		String string="Abhishek123";
		
		int count=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
		
			}
		}
		System.out.println(count);
	}

}
