package com.java_8;

interface I{
	void m1(int i);
}
public class convert {
	public static void main(String[] args) {
		I  i1=(int i)->{
			char c=(char)i;
			System.out.println("chrecter : "+c);
		};
		i1.m1(65);
		i1.m1(97);
	}

}
