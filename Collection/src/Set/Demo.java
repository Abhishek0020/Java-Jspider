package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set<String>s=new HashSet<String>();
		s.add("kanemama");
		s.add("Dhoni");
		s.add("Hitman");
		s.add("king");
		s.add("mr 360");
		Iterator<String>i=s.iterator();
		while(i.hasNext()) {
		String var=i.next();
//		if(var=="kanemama")
//			i.remove();
		}
		System.out.println(s);
	}

}
