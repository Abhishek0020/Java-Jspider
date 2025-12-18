package method_ref;

import java.util.function.Function;

interface I1{
	public void add(int a,int b);
}
public class Test {
	
	
	public static void m1(int i,int j) {
		System.out.println(i+"+"+j+"="+(i+j));
	}
	public static void main(String[] args) {
		I1 i1=Test::m1;
		i1.add(20, 10);
		Function<String, Integer>fn=Integer::parseInt;
		System.out.println(fn.apply("40"));
	}

}
