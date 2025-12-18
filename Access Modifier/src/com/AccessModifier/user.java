
package com.AccessModifier;

import java.util.*;
public class user {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the user i/p 1 and 2 : ");
		int choice=scanner.nextInt();
		
		switch(choice) {
		case 1: OnlineShoping onlineShoping=new flipkart();
				onlineShoping.login();
				onlineShoping.buy();
				break;
		case 2: OnlineShoping onlineShoping2=new Amazon();
				onlineShoping2.login();
				onlineShoping2.buy();
				break;
		default : System.out.println("default user input i/p:  ");
				
		}
	}

}
