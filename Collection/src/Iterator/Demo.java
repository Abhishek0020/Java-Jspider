package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		Iterator<Integer>i=l.iterator();
		while(i.hasNext()) {
			int v=i.next();
			if(v==50)
				i.remove();
		}
		System.out.println(l);
	}

}
