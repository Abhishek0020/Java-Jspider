package Predicate;

import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		int n=7;
		Predicate<Integer>predicate=i->i%2==0;
		System.out.println(predicate.test(n));//false
	}

}
