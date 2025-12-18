package demo;

public class A {
	public static void num(int st,int end) {
		if(st%2==1) {
			System.out.println(st);
		}
		st--;
		if(st>=end) {
			A.num(st, end);
		}
	
		
	}
public static void main(String[] args) {
	A.num(10, 1);
}
}
