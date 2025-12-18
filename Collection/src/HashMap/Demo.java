package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(18, "Goat");
		map.put(7, "Thala");
		map.put(45, "Hitman");
		map.put(333, "Boss");
		map.put(18, "King");
		Set<Integer>set=map.keySet();
		Iterator<Integer>iterator=set.iterator();
		while(iterator.hasNext()) {
			Object k=iterator.next();
			Object v=map.get(k);
			System.out.println(k+"="+v);
		}
	}

}
