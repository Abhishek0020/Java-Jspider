package List;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<>();
		l.add("jsp");
		l.add("qsp");
		l.add("psp");
		l.add("prosp");
		l.add("gsp");
		l.add("tsp");
		System.out.println(l.get(2));//psp
		l.add(2,"tys");
		System.out.println(l);
		
		System.out.println(l.isEmpty());//false
		System.out.println(l.size());//7
		
		
		
		
	}

}
