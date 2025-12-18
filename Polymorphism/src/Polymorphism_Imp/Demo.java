package Polymorphism_Imp;

public class Demo {
	
	void m1() {
		System.out.println(1);
	}
     void m1(int a) {
    	 System.out.println(2);
     }
     void m1(int a,int b) {
    	 System.out.println(3);
     }
     public static void main(String[] args) {
		Demo demo=new Demo();
		demo.m1();
		demo.m1(1);
		demo.m1(1,3);
		
	}

}
