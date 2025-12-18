package com.AccessModifier;

public class odd {
	public static void m1(int st,int end) {
		if(st%2==1) {
			System.out.println(st);
		}
		st++;
		if(st<=end) {
			odd.m1(st, end);
		}
	}
	public static void main(String[] args) {
		odd.m1(1, 10);
	}
}
