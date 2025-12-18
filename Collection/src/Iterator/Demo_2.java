package Iterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Demo_2 {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(10,20,30,40,50);
	ListIterator<Integer>i=l.listIterator(l.size());
	while(i.hasPrevious())
		System.out.print(i.previous()+" ");//previous direction
	System.out.println();
	while(i.hasNext())
		System.out.print(i.next()+" ");//Forward direction
}
}
