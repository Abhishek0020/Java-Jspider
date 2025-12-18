package com.AccessModifier;

public class flipkart extends OnlineShoping {	
static int id=123;
static String password="abhishek";

void login() {
	if(id==123) {
		if(password=="abhishek") {
			System.out.println("log in successfull : ");
		}
		else {
			System.out.println("wrong password : ");
		}
	}
	else {
		System.out.println("wrong id ");
	}	
}
	void buy()
	{
	String card="items ";
	if(card=="items") {
		System.out.println("paid ammount : ");
		System.out.println("paying successfull : ");	
	}
	else {
		System.out.println("not paid : ");
		}	
	}	
}
