package com.AccessModifier;

import Access_Modifier.Test;

public class B extends Test {
	
	 void add() {
		System.out.println(10+2);
	}
	public static void main(String[] args) {
		B b=new B();
		b.add();
		b.add();
	}
}
