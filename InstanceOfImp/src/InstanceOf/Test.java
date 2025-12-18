package InstanceOf;

public class Test {
	public static void main(String[] args) {
		Son s=new Son();
		Daughter d=new Daughter();
		Father father=new Father();
		System.out.println(s instanceof Son);
		System.out.println(new Son() instanceof Son );
		
		System.out.println(d instanceof Daughter);
		
		
		System.out.println(father  instanceof Father );
		System.out.println(s instanceof Father);
		System.out.println(father instanceof Son);//false
		
		System.out.println(d instanceof Father);
		
		System.out.println(father instanceof Daughter);//false 
	}

}
