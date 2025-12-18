package com.AccessModifier;

public class Son extends Father {
	
	
	 void bike() {
		 System.out.println("modified rx 100 bike : ");
	 }
	 public static void main(String[] args) {
		Son son=new Son();
		son.bike();
	}

}
