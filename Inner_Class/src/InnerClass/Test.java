package InnerClass;

 class A {
	static int i=10;
	private int j=20;
	class B{
		void m1() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	
	}
public class Test{
	public static void main(String[] args) {
		A a=new A();
		A.B b=a.new  B();
		b.m1();
	}
	
}
