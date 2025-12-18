package NestedCLass;

public class B {
	
	int i=10;
	
	static class A{
		int i=20;
		void m1() {
			System.out.println(new B().i);
			System.out.println(i);
		}
		public static void main(String[] args) {
			System.out.println("main method of-A");
		}
	}
	public static void main(String[] args) {
		System.out.println("main method of-- B");
		B.A a=new B.A();
		a.m1();
	}
}
