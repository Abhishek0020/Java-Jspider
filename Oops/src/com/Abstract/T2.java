package com.Abstract;

public class T2 implements T1 {
	@Override
	public void m1() {
		System.out.println(10+29);
	}
	public static void main(String[] args) {
		T1 t=new T2();
		t.m1();
		
	}

}
