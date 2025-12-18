package InnerClass;

public class Demo {
	public static void main(String[] args) {	
		class A{
			void m1(int a,int b) {
			System.out.println(a+"+"+b+"="+(a+b));	
		}
	}
	A a=new A();
	a.m1(10,20);
	}
}
