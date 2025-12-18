package com;

import java.util.Scanner;

public class ToggleCharecter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string to be toggle string : ");
		String string=scanner.nextLine();
		StringBuilder sBuilder=new StringBuilder();
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				sBuilder.append((char)(ch+32));
			}
			else if(ch>='a' && ch<='z') {
				sBuilder.append((char)(ch-32));
				
			}
			else {
				sBuilder.append(ch);
			}
		}
		String string1=sBuilder.toString();
		System.out.println(string1);
	}

}
