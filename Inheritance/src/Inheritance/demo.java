package Inheritance;

public class demo {
	
	demo(){
		this(10);
		System.out.println(1);
	}
	demo(int a){
		this(10,5.6);
		System.out.println(2);
		
	}
	demo(int a,double b){
		this(5.8,10);
		System.out.println(3);
	}
	demo(double a,int b){
		System.out.println(4);
	}
public static void main(String[] args) {
	demo demo=new demo();

}
}
