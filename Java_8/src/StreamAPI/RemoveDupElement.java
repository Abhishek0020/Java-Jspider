package StreamAPI;

import java.util.Arrays;

public class RemoveDupElement {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2};
		int[] b=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(b));
	}

}
