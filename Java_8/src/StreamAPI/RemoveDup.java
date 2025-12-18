package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDup {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(9,8,7,7,6,5,4,3,2,1);
		List<Integer>list=l.stream().distinct().toList();
		System.out.println(list);
		
	}

}
