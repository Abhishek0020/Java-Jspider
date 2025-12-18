package com.AccessModifier;

public class Amazon extends OnlineShoping {

	static int id=143;
	static String password="abhi";
	int user;
	String pass;
	int items;
	
	void login() {
		if(id==143) {
			if(password=="abhi") {
				System.out.println("log in successfull : ");
				
			}
			
			else {
				System.out.println("wrong password : ");
			}				
		}
		else {
			System.out.println("wrong password : ");
		}	
	}
	void buy() {
		String card="items";
		if(card=="items") {
			System.out.println("paid ammount : ");
			System.out.println("paying successfull : ");
		}
		else {
			System.out.println("not paid : ");
		}	
	}	
}
