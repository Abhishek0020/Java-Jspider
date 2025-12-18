package com;

import java.util.Scanner;

public class PrintVowelChar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string : ");
		String string=scanner.nextLine();
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.println(ch+" is vowel char");
			}
		}
	}

}
