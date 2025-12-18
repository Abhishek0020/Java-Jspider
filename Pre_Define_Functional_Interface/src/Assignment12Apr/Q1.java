
package Assignment12Apr;

import java.util.function.Predicate;

public class Q1 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		Predicate<Integer>p=i->i%2==0;
	
		System.out.println("even number : ");
		for(int num:arr) {
			if (p.test(num)) {
				System.out.print(num+" ");
				
			}
		}
	}

}
