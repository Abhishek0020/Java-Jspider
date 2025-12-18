package Function;

import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		int n=5;
		Function<Integer, Integer>fn=i->i*i;
		System.out.println(fn.apply(n));
	}

}
