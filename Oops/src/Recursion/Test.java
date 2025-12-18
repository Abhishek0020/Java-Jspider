package Recursion;

public class Test {
	public static void m1(int st,int end) {
		System.out.println(st);
		st++;
		if(st<=end) {
			Test.m1(st, end);
		}
		
	}
	public static void main(String[] args) {
		Test.m1(1, 5);
	}

}
