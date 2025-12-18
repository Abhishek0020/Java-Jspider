package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {
	public static void main(String[] args) {
		int a[]= {6,5,7,8,8,1,3,5,3,4,6,0,0};
		Set<Integer>s=new LinkedHashSet<Integer>();
		for(int n:a)
			s.add(n);
		System.out.println(s);
	}

}
