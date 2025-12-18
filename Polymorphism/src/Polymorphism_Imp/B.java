package Polymorphism_Imp;

public class B extends A {
	
	//runtime polymorphism-override
	@Override
	void add() {
		System.out.println(10+10);
	}
	public static void main(String[] args) {
		A a=new B();
		a.add();
	}

}
