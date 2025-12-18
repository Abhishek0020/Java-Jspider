package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Occurance {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,2};
		Arrays.stream(a).mapToObj(i->i).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.forEach((ch,i)->System.out.println(ch+"="+i));
	}

}
