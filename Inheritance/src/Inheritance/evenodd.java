package Inheritance;

public class evenodd {
	
	public static void m1(int st,int end) {
//		System.out.println(st);
		if(st%2==1) {
			System.out.println(st);
		}
			st--;
			if(st>=end) {
				evenodd.m1(st,end);
			}
		}
	
	
	
	public static void main(String[] args) {
		evenodd.m1(10, 1);
		
	}
	}

