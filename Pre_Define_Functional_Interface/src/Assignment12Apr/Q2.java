
package Assignment12Apr;

import java.util.function.Function;


public class Q2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		Function<Integer, Integer>fn=i->i*i;
		System.out.println("square digit in an array : ");
		for(int a:arr) {
			
				System.out.println(fn.apply(a));
		}
		
		
	}

}
