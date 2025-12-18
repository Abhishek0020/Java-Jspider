package constructor_ref;

import java.util.function.Supplier;

class A{
	A(){
		System.out.println("A()-Cons");
	}
}
public class Demo {
public static void main(String[] args) {
	Supplier<A>sp=()->new A();
	A a1=sp.get();
	A a2=sp.get();
	A a3=sp.get();
	System.out.println("==========================");
	Supplier<A>s=A::new;
	A a4=s.get();
	A a5=s.get();
}
}
