package Inheritance;

public class A {
	public static void add(int a,int b) {
		System.out.println(a+b);
		A.sub(80, 40);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
		A.add(20, 80);
	}
	public static void main(String[] args) {
		A.add(40, 80);
	}

}
